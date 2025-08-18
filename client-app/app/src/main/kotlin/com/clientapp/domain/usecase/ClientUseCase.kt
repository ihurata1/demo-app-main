package com.clientapp.domain.usecase

import com.clientapp.data.repository.ClientRepository

class ClientUseCase(
    private val clientRepository: ClientRepository
) {
    
    suspend fun connectToServer(serverUrl: String): Result<String> {
        return clientRepository.connectToServer(serverUrl)
    }
    
    suspend fun disconnectFromServer(): Result<String> {
        return clientRepository.disconnectFromServer()
    }
    
    suspend fun getConnectionStatus(): Result<Boolean> {
        return clientRepository.getConnectionStatus()
    }
    
    suspend fun sendMessage(message: String): Result<String> {
        return clientRepository.sendMessage(message)
    }
} 