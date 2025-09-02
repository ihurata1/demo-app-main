# Drone Communication Apps

A comprehensive Android application suite for drone communication, featuring both client and server applications with Bluetooth Low Energy (BLE) and gRPC capabilities.

## 🚁 Overview

This project consists of two Android applications:

- **Server App**: Acts as a drone peripheral device, advertising drone information via BLE and providing gRPC services
- **Client App**: Acts as a central device, scanning for BLE advertisements and connecting to gRPC servers

## ✨ Features

### 🔵 Server App (Peripheral)
- **BLE Advertising**: Broadcasts drone information using TLV format
- **GATT Server**: Provides structured data exchange via BLE characteristics
- **gRPC Services**: Core and Telemetry services for drone communication
- **Mock Data**: Simulates drone brand, model, and serial number
- **Real-time Status**: Live updates of BLE advertising and connection states

### 📱 Client App (Central)
- **BLE Scanning**: Discovers nearby BLE devices advertising drone information
- **GATT Client**: Connects to BLE services and reads characteristics
- **gRPC Client**: Connects to server applications for drone communication
- **Dynamic IP Configuration**: Configurable server IP address with persistent storage
- **Real-time Telemetry**: Live drone status and telemetry data display

### 🔗 Communication Protocols
- **Bluetooth Low Energy (BLE)**: For device discovery and basic information exchange
- **gRPC**: For high-bandwidth, real-time communication
- **JSON**: Data format for drone information exchange
- **TLV (Type-Length-Value)**: Compact format for BLE advertising data

## 🏗️ Architecture

```
┌─────────────────┐    BLE     ┌─────────────────┐
│   Client App    │◄──────────►│  Server App     │
│   (Central)     │            │  (Peripheral)   │
└─────────────────┘            └─────────────────┘
         │                              │
         │                              │
         ▼                              ▼
┌─────────────────┐            ┌─────────────────┐
│   gRPC Client   │            │   gRPC Server   │
│   Services      │            │   Services      │
└─────────────────┘            └─────────────────┘
```

## 📱 Screenshots

### Server App
- Main interface with BLE advertising controls
- Real-time connection status
- Dedicated BLE demo activity
- System logs and monitoring

### Client App
- Server IP configuration dialog
- BLE device scanning interface
- Drone telemetry dashboard
- Connection management

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- Android SDK API 21+ (Android 5.0+)
- Android device with Bluetooth LE support
- Two Android devices (one for server, one for client)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/drone-communication-apps.git
   cd drone-communication-apps
   ```

2. **Open in Android Studio**
   - Open `client-app` for the client application
   - Open `server-app` for the server application

3. **Build and Install**
   ```bash
   # Build client app
   cd client-app
   ./gradlew assembleDebug
   
   # Build server app
   cd ../server-app
   ./gradlew assembleDebug
   ```

### Configuration

#### Server App
1. Install the server app on one device
2. Launch the app
3. Grant Bluetooth permissions when prompted
4. Tap "BLE Başlat" to start advertising
5. The app will broadcast drone information via BLE

#### Client App
1. Install the client app on another device
2. Launch the app
3. Enter the server device's IP address when prompted
4. Grant Bluetooth permissions when prompted
5. Tap "BLE Taramayı Başlat" to scan for devices
6. Tap "Server'a Bağlan" to connect via gRPC

## 🔧 Technical Details

### BLE Implementation

#### Server (Peripheral)
- **Service UUID**: Custom drone service
- **Characteristics**: Read, Write, and Indicate characteristics
- **Manufacturer Data**: DJI manufacturer ID (2218) with TLV format
- **Advertising Data**: Compact drone information for discovery

#### Client (Central)
- **Scanning**: Continuous BLE device discovery
- **Connection Management**: Automatic connection to discovered devices
- **Data Parsing**: TLV format parsing and JSON reconstruction
- **Error Handling**: Connection timeouts and retry mechanisms

### gRPC Services

#### Core Service
- Connection state management
- Drone status monitoring
- Command execution

#### Telemetry Service
- Real-time position data
- Attitude information
- Flight status updates

### Data Formats

#### BLE Advertising (TLV)
```
Type: 0x01 (Vendor ID)
Length: 2 bytes
Value: 0x08AA (DJI manufacturer ID)

Type: 0x02 (Vendor Name)
Length: 3 bytes
Value: "DJI"

Type: 0x03 (Serial Number)
Length: 10 bytes
Value: "1234567890"
```

#### GATT Characteristics (JSON)
```json
{
  "brand": "DJI",
  "model": "Mavic 3",
  "serialNumber": "1234567890"
}
```

## 📋 Permissions

### Required Permissions
- `BLUETOOTH`: Basic Bluetooth functionality
- `BLUETOOTH_ADMIN`: Bluetooth administration
- `BLUETOOTH_ADVERTISE`: BLE advertising (Android 12+)
- `BLUETOOTH_CONNECT`: BLE connections (Android 12+)
- `BLUETOOTH_SCAN`: BLE scanning (Android 12+)
- `ACCESS_FINE_LOCATION`: Required for BLE scanning
- `ACCESS_COARSE_LOCATION`: Alternative location permission

### Permission Handling
- Runtime permission requests for Android 6.0+
- Automatic permission validation
- User-friendly permission explanations

## 🧪 Testing

### BLE Testing
1. **Server Device**: Start BLE advertising
2. **Client Device**: Scan for BLE devices
3. **Verification**: Check if drone information is received
4. **Connection**: Verify GATT connection establishment

### gRPC Testing
1. **Server Device**: Start gRPC server
2. **Client Device**: Connect to server IP
3. **Verification**: Check connection status
4. **Data Exchange**: Verify telemetry data flow

## 🔍 Troubleshooting

### Common Issues

#### BLE Not Working
- Ensure Bluetooth is enabled on both devices
- Check if devices support Bluetooth LE
- Verify location permissions are granted
- Restart Bluetooth on both devices

#### gRPC Connection Failed
- Verify server IP address is correct
- Check if server app is running
- Ensure both devices are on the same network
- Check firewall settings

#### App Crashes
- Clear app data and cache
- Reinstall the application
- Check Android version compatibility
- Review logcat for error details

### Debug Information
- Enable verbose logging in Android Studio
- Check logcat for BLE and gRPC messages
- Monitor network connectivity
- Verify Bluetooth adapter status

## 📚 API Reference

### BLEManager (Server)
```kotlin
class BLEManager(private val context: Context) {
    fun startAdvertising()
    fun stopAdvertising()
    fun startGattServer()
    fun cleanup()
}
```

### BLEManager (Client)
```kotlin
class BLEManager(private val context: Context) {
    fun startScanning()
    fun stopScanning()
    fun connectToDevice(device: BluetoothDevice)
    fun cleanup()
}
```

### gRPC Services
```kotlin
// Core Service
interface CoreService {
    fun connect()
    fun disconnect()
    fun subscribeToConnectionState(): Flow<ConnectionStateResponse>
}

// Telemetry Service
interface TelemetryService {
    fun subscribeToPosition(): Flow<PositionResponse>
    fun subscribeToAttitude(): Flow<AttitudeResponse>
}
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Guidelines
- Follow Kotlin coding conventions
- Add comprehensive error handling
- Include unit tests for new features
- Update documentation for API changes
- Test on multiple Android versions

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- **MAVSDK**: For drone communication protocols
- **gRPC**: For high-performance RPC framework
- **Android Bluetooth LE**: For BLE implementation
- **Kotlin Coroutines**: For asynchronous programming

## 📞 Support

- **Issues**: Report bugs and feature requests via GitHub Issues
- **Discussions**: Join community discussions in GitHub Discussions
- **Wiki**: Check the project wiki for detailed documentation
- **Email**: Contact maintainers for direct support

## 🔄 Version History

### v1.0.0 (Current)
- Initial release with BLE and gRPC functionality
- Server app with BLE advertising
- Client app with BLE scanning and gRPC connection
- Dynamic IP configuration
- Comprehensive error handling

### Planned Features
- Multi-drone support
- Advanced telemetry visualization
- Offline mode
- Cloud synchronization
- Enhanced security features

---

**Note**: This project is designed for educational and development purposes. Ensure compliance with local regulations when using with actual drone hardware.
