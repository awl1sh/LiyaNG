package org.liyang.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "servers")
data class ServerConfig(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    
    @SerializedName("name")
    val name: String,
    
    @SerializedName("address")
    val address: String,
    
    @SerializedName("port")
    val port: Int,
    
    @SerializedName("protocol")
    val protocol: String = "vmess", // vmess, vless, trojan, shadowsocks
    
    @SerializedName("uuid")
    val uuid: String? = null,
    
    @SerializedName("password")
    val password: String? = null,
    
    @SerializedName("method")
    val method: String? = null,
    
    @SerializedName("config")
    val config: String? = null, // JSON config
    
    @SerializedName("remarks")
    val remarks: String? = null,
    
    @SerializedName("createdAt")
    val createdAt: Long = System.currentTimeMillis(),
    
    @SerializedName("isDefault")
    val isDefault: Boolean = false
)
