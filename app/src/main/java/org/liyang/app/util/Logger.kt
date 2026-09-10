package org.liyang.app.util

import timber.log.Timber

object Logger {
    fun init() {
        Timber.plant(Timber.DebugTree())
    }
    
    fun d(message: String) {
        Timber.d(message)
    }
    
    fun e(message: String, throwable: Throwable? = null) {
        Timber.e(throwable, message)
    }
    
    fun i(message: String) {
        Timber.i(message)
    }
}
