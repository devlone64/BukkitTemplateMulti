plugins {
    id("java")
}

group = "io.gitlab.lone64.template"

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://libraries.minecraft.net/")
        maven("https://maven.lone64.dev/releases")
        maven("https://repo.codemc.io/repository/maven-snapshots/")
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }

    dependencies {
        compileOnly("org.projectlombok:lombok:1.18.32")
        compileOnly("io.gitlab.lone64:mcframework-api:1.0.2")
        compileOnly("org.spigotmc:spigot-api:1.20.4-R0.1-SNAPSHOT")

        // Annotation Processors
        annotationProcessor("org.projectlombok:lombok:1.18.32")
    }
}

java.toolchain {
    languageVersion.set(JavaLanguageVersion.of(17))
}