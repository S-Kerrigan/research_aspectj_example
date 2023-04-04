plugins {
    java

    id ("io.qameta.allure") version "2.11.2"

    id ("io.freefair.lombok") version "6.6.3"
    id ("io.freefair.aspectj.post-compile-weaving") version "6.6.3"
}

group = "question.mcve"
version = "0.0.1"

val aspectjWeaverVersion = "1.9.19"
val log4j = "2.19.0"
val junit5 = "5.9.1"
val junitPlatform = "1.9.1"

repositories {
    mavenCentral()
}

allure {
    report {
        reportDir.set(rootProject.file("build/allure-results"))
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    /*ajc {
        enabled = true
        classpath
        options {
            aspectpath.setFrom configurations.aspect
                    compilerArgs = []
        }
    }*/
}

//tasks.compileJava.ajc.options.compilerArgs << "-showWeaveInfo -verbose"
//compileTestJava.ajc.options.compilerArgs << "-showWeaveInfo -verbose"
//compileTestJava.ajc.options.aspectpath.from sourceSets.main.output

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:${junit5}")
    implementation("org.junit.jupiter:junit-jupiter-api:${junit5}")
    implementation("org.junit.jupiter:junit-jupiter-params:${junit5}")
    implementation("org.junit.platform:junit-platform-suite:${junitPlatform}")
    implementation("org.junit.platform:junit-platform-launcher:${junitPlatform}")

    implementation("org.aspectj:aspectjrt:${aspectjWeaverVersion}")
    implementation("org.aspectj:aspectjweaver:${aspectjWeaverVersion}")

//    testImplementation("org.aspectj:aspectjrt:${aspectjWeaverVersion}")
//    testImplementation("org.aspectj:aspectjweaver:${aspectjWeaverVersion}")
//    testImplementation("org.aspectj:aspectjtools:${aspectjWeaverVersion}")

    testImplementation("org.junit.jupiter:junit-jupiter:${junit5}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:${junit5}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${junit5}")
    testImplementation("org.junit.platform:junit-platform-suite:${junitPlatform}")
    testImplementation("org.junit.platform:junit-platform-launcher:${junitPlatform}")
}