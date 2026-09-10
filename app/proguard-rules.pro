# This is a configuration file for ProGuard.
# http://proguard.sourceforge.net/index.html#manual/usage.html

-dontusemixedcaseclassnames
-verbose

# Optimization
-optimizationpasses 5
-dontpreverify
-repackageclasses ''
-allowaccessmodification
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

# Keep line numbers for debugging
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Keep custom application classes
-keep class org.liyang.app.** { *; }

# Keep model classes
-keep class org.liyang.app.data.model.** { *; }

# Keep service classes
-keep class org.liyang.app.service.** { *; }

# Gson
-keepattributes Signature
-keepattributes *Annotation*
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.stream.** { *; }
-keep class com.google.gson.** { *; }

# Room
-keep class * extends androidx.room.RoomDatabase
-keep class * extends androidx.room.Dao { *; }

# Timber
-dontwarn timber.**
-keep class timber.** { *; }

# OkHttp
-dontwarn okhttp3.**
-dontwarn okio.**
-keep class okhttp3.** { *; }

# Retrofit
-dontwarn retrofit2.**
-keep class retrofit2.** { *; }

# Kotlin
-dontwarn kotlin.**
