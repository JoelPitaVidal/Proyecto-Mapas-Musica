import org.gradle.internal.impldep.org.jsoup.safety.Safelist.basic

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        maven {

            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            authentication{
                basic()
            }
            credentials{
                username = "mapbox"
                password = "sk.eyJ1Ijoiam9lbHBpdGF2aWRhbCIsImEiOiJjbTQ1a2Rtd3cwbG4yMmtzNDJ3ZWUwZ2I1In0.RHJ994dwjALgNRlU-c5gZg"
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ProyectoPMDM"
include(":app")
 