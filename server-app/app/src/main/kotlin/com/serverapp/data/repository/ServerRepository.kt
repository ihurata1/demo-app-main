package com.serverapp.data.repository

interface ServerRepository {
    suspend fun startServer(): Result<String>
    suspend fun stopServer(): Result<String>
    suspend fun getServerStatus(): Result<Boolean>
} 