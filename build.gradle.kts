buildscript {
  repositories {
    google()
    mavenCentral()
  }
  dependencies {
    classpath(libs.android.gradle.plugin)
    classpath(libs.kotlin.gradle.plugin)
  }
}

plugins {
  // https://github.com/google/dagger/issues/3965#issuecomment-1662360344
  alias(libs.plugins.ksp) apply false
}