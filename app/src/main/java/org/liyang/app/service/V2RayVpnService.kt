package org.liyang.app.service

import android.content.Intent
import android.net.VpnService
import android.os.Binder
import android.os.IBinder
import timber.log.Timber

class V2RayVpnService : VpnService() {

    private val binder = LocalBinder()

    inner class LocalBinder : Binder() {
        fun getService(): V2RayVpnService = this@V2RayVpnService
    }

    override fun onCreate() {
        super.onCreate()
        Timber.d("V2RayVpnService created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Timber.d("V2RayVpnService started")
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder {
        return binder
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("V2RayVpnService destroyed")
    }

    fun startVpn(serverConfig: String) {
        Timber.d("Starting VPN with config: $serverConfig")
        // TODO: Implement VPN connection logic
    }

    fun stopVpn() {
        Timber.d("Stopping VPN")
        // TODO: Implement VPN disconnection logic
    }
}
