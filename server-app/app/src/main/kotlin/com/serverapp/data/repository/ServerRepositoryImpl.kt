package com.serverapp.data.repository

import kotlinx.coroutines.delay

class ServerRepositoryImpl : ServerRepository {
    
    private var isServerRunning = false
    
    override suspend fun startServer(): Result<String> {
        return try {
            delay(1000) // Simulate server startup time
            isServerRunning = true
            Result.success("Server started successfully")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun stopServer(): Result<String> {
        return try {
            delay(500) // Simulate server shutdown time
            isServerRunning = false
            Result.success("Server stopped successfully")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getServerStatus(): Result<Boolean> {
        return try {
            Result.success(isServerRunning)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
} 