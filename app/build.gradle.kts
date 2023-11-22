plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.stroketest"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.stroketest"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        dataBinding{
            enable = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("com.googlecode.json-simple:json-simple:1.1.1")

}
configurations.all {
    resolutionStrategy.dependencySubstitution {
        substitute(module("org.hamcrest:hamcrest-core:1.3")).using(module("junit:junit:4.13.2"))
    }
}