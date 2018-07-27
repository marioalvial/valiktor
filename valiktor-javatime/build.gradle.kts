import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

dependencies {
    implementation(project(":valiktor-core"))
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("reflect"))
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}