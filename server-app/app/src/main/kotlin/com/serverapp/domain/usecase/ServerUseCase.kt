package com.serverapp.domain.usecase

import com.serverapp.data.repository.ServerRepository

class ServerUseCase(
    private val serverRepository: ServerRepository
) {
    
    suspend fun startServer(): Result<String> {
        return serverRepository.startServer()
    }
    
    suspend fun stopServer(): Result<String> {
        return serverRepository.stopServer()
    }
    
    suspend fun getServerStatus(): Result<Boolean> {
        return serverRepository.getServerStatus()
    }
} 