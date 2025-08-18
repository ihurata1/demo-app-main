package com.clientapp.data.repository

import kotlinx.coroutines.delay

class ClientRepositoryImpl : ClientRepository {
    
    private var isConnected = false
    private var currentServerUrl = ""
    
    override suspend fun connectToServer(serverUrl: String): Result<String> {
        return try {
            delay(1000) // Simulate connection time
            currentServerUrl = serverUrl
            isConnected = true
            Result.success("Connected to server: $serverUrl")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun disconnectFromServer(): Result<String> {
        return try {
            delay(500) // Simulate disconnection time
            isConnected = false
            currentServerUrl = ""
            Result.success("Disconnected from server")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun getConnectionStatus(): Result<Boolean> {
        return try {
            Result.success(isConnected)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    override suspend fun sendMessage(message: String): Result<String> {
        return try {
            if (!isConnected) {
                return Result.failure(Exception("Not connected to server"))
            }
            delay(200) // Simulate network delay
            Result.success("Message sent: $message")
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
} 