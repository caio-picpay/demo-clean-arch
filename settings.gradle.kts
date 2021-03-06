/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/7.3.3/userguide/multi_project_builds.html
 */

rootProject.name = "demo-clean-arch"

include(":enterprise-business-rules")
include(":application-business-rules")
include(":spring")

project(":enterprise-business-rules").projectDir = File("$rootDir/clean-arch/enterprise-business-rules")
project(":application-business-rules").projectDir = File("$rootDir/clean-arch/application-business-rules")
project(":spring").projectDir = File("$rootDir/clean-arch/frameworks-and-drivers/spring")