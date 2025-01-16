plugins {
    id("java")
    id("com.github.johnrengelman.shadow").version("7.1.2")
}

group = "io.gitlab.lone64.template"
version = "1.0.0"

dependencies {
    implementation(project(":api"))
}

tasks.shadowJar {
    archiveFileName.set("template-bukkit-${version}.jar")
}