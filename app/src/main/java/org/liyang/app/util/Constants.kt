package org.liyang.app.util

object Constants {
    const val CHANNEL_ID = "liyang_vpn_channel"
    const val NOTIFICATION_ID = 1001
    const val SHARED_PREF_NAME = "liyang_prefs"
    const val KEY_DEFAULT_SERVER = "default_server"
    const val KEY_AUTO_CONNECT = "auto_connect"
    
    object Protocol {
        const val VMESS = "vmess"
        const val VLESS = "vless"
        const val TROJAN = "trojan"
        const val SHADOWSOCKS = "shadowsocks"
    }
}
