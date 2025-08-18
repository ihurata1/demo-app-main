plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.protobuf")
}

android {
    namespace = "com.serverapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.serverapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/java", "src/main/kotlin")
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/INDEX.LIST"
            excludes += "META-INF/*.SF"
            excludes += "META-INF/*.DSA"
            excludes += "META-INF/*.RSA"
            excludes += "META-INF/io.netty.versions.properties"
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.25.3"
    }
    plugins {
        create("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.62.2"
        }
        create("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.4.1:jdk8@jar"
        }
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                create("java") {
                    option("lite")
                }
                create("kotlin") {
                    option("lite")
                }
            }
            task.plugins {
                create("grpc") {
                    option("lite")
                }
                create("grpckt") {
                    option("lite")
                }
            }
            // Add include paths for Google protobuf descriptors
            task.generateDescriptorSet = true
            task.descriptorSetOptions.includeSourceInfo = true
            task.descriptorSetOptions.includeImports = true
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-process:2.7.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("io.reactivex.rxjava3:rxjava:3.1.3")
    implementation("io.reactivex.rxjava3:rxandroid:3.0.0")

    // Netty Server (specific modules only)
    implementation("io.netty:netty-transport:4.1.100.Final")
    implementation("io.netty:netty-codec:4.1.100.Final")
    implementation("io.netty:netty-handler:4.1.100.Final")
    implementation("io.netty:netty-buffer:4.1.100.Final")

    // gRPC
    implementation("io.grpc:grpc-kotlin-stub:1.4.1") {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
    }
    implementation("io.grpc:grpc-protobuf-lite:1.62.2") {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
    }
    implementation("io.grpc:grpc-okhttp:1.62.2") {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
    }
    implementation("io.grpc:grpc-netty-shaded:1.62.2") {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
    }
    implementation("io.grpc:grpc-stub:1.62.2") {
        exclude(group = "com.google.protobuf", module = "protobuf-java")
    }
    
    // Protobuf
    implementation("com.google.protobuf:protobuf-kotlin-lite:3.25.3")
    implementation("com.google.protobuf:protobuf-javalite:3.25.3")
    
    // Protobuf includes for compilation
    compileOnly("com.google.protobuf:protobuf-java:3.25.3")
    
    // Required for gRPC
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    testImplementation("junit:junit:4.13.2")
} 