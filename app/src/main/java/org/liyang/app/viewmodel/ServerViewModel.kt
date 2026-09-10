package org.liyang.app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.liyang.app.data.database.AppDatabase
import org.liyang.app.data.model.ServerConfig

class ServerViewModel(application: Application) : AndroidViewModel(application) {

    private val database = AppDatabase.getDatabase(application)
    private val serverDao = database.serverDao()

    val allServers: LiveData<List<ServerConfig>> = serverDao.getAllServers()
    val defaultServer: LiveData<ServerConfig?> = serverDao.getDefaultServer()

    fun addServer(server: ServerConfig) {
        viewModelScope.launch {
            serverDao.insertServer(server)
        }
    }

    fun updateServer(server: ServerConfig) {
        viewModelScope.launch {
            serverDao.updateServer(server)
        }
    }

    fun deleteServer(server: ServerConfig) {
        viewModelScope.launch {
            serverDao.deleteServer(server)
        }
    }

    fun getServerById(serverId: Int): LiveData<ServerConfig> {
        return serverDao.getServerById(serverId)
    }
}
