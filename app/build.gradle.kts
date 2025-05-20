plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.tum.tummile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tum.tummile"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 34
        versionCode = 8
        versionName = "1.8"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    //For Theme
    implementation (libs.material)

    //photo editing
    implementation ("com.google.mlkit:face-detection:16.1.5")



    //show case
    implementation ("com.github.iammert:MaterialIntroView:1.6.0")
    implementation ("com.google.android.gms:play-services-ads:22.6.0") // সর্বশেষ version


    implementation (libs.glide)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}