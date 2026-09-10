package org.liyang.app.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import org.liyang.app.data.model.ServerConfig

@Dao
interface ServerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertServer(server: ServerConfig): Long

    @Update
    suspend fun updateServer(server: ServerConfig)

    @Delete
    suspend fun deleteServer(server: ServerConfig)

    @Query("SELECT * FROM servers ORDER BY createdAt DESC")
    fun getAllServers(): LiveData<List<ServerConfig>>

    @Query("SELECT * FROM servers WHERE id = :serverId")
    fun getServerById(serverId: Int): LiveData<ServerConfig>

    @Query("SELECT * FROM servers WHERE isDefault = 1 LIMIT 1")
    fun getDefaultServer(): LiveData<ServerConfig?>

    @Query("DELETE FROM servers")
    suspend fun deleteAllServers()
}
