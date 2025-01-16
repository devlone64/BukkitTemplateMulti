plugins {
    id("java")
    id("maven-publish")
    id("com.github.johnrengelman.shadow").version("7.1.2")
}

group = "${properties["PROJECT_GROUP"]}"
version = "${properties["PROJECT_VERSION"]}"

tasks.shadowJar {
    archiveFileName.set("api-${version}-release.jar")
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
        maven("https://repo.repsy.io/mvn/lone64/releases/") {
            credentials {
                username = "${properties["MAVEN_USERNAME"]}"
                password = "${properties["MAVEN_PASSWORD"]}"
            }
        }
    }
}