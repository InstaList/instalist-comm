# InstaList comm

Communication project for [InstaList](https://github.com/InstaList/instalist-android) and it's 
[Server](https://github.com/InstaList/instalist-server). 

Currently, InstaList uses a REST-API accepting and creating JSON for transmitting data. The messages
can get created and parsed in a easy via [Jackson](https://github.com/FasterXML/jackson) and it's 
`databind` module.

Classes that can be used for this purpose are located in package 
`org.noorganization.instalist.comm.message`.

## Usage

Use these classes as a library, for example via gradle. This library is not available in the 
central repository. But it can be included with a master gradle-project like this:

    // gradle.settings
    include ':instalist-comm'

    // build.gradle
    dependencies {
        compile(':instalist-comm')
        // ...
    }

This works if your master is one directory above this project.

You can create IntelliJ-IDEA compatible project files with:

    ./gradlew idea

