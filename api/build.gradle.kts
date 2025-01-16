plugins {
    id("java")
    id("maven-publish")
    id("com.github.johnrengelman.shadow").version("7.1.2")
}

group = "io.gitlab.lone64.template.api"
version = "1.0.0"

tasks.shadowJar {
    archiveFileName.set("template-api-${version}.jar")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "io.gitlab.lone64"
            artifactId = "template-api"
            from(components["java"])
        }
    }

    repositories {
        maven("https://maven.lone64.dev/releases/") {
            credentials {
                username = "${properties["MAVEN_USERNAME"]}"
                password = "${properties["MAVEN_PASSWORD"]}"
            }
        }
    }
}