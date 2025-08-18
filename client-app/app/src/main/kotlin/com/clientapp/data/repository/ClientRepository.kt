package com.clientapp.data.repository

interface ClientRepository {
    suspend fun connectToServer(serverUrl: String): Result<String>
    suspend fun disconnectFromServer(): Result<String>
    suspend fun getConnectionStatus(): Result<Boolean>
    suspend fun sendMessage(message: String): Result<String>
} 