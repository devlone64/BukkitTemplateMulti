plugins {
    id("java")
    id("com.github.johnrengelman.shadow").version("7.1.2")
}

group = "${properties["PROJECT_GROUP"]}"
version = "${properties["PROJECT_VERSION"]}"

tasks.shadowJar {
    archiveFileName.set("${properties["PROJECT_NAME"]}-${version}-release.jar")
}