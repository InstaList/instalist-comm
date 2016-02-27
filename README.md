# InstaList comm

Communication project for [InstaList](https://bitbucket.org/fhnoorg/einkaufsliste) and it's 
[Server](https://bitbucket.org/fhnoorg/einkaufsliste-server). 

Currently, InstaList uses a REST-API accepting and creating JSON for transmitting data. The messages
can get created and parsed in a easy via [Jackson](https://github.com/FasterXML/jackson) and it's 
`databind` module.

Classes that can be used for this purpose are located in package 
`org.noorganization.instalist.comm.message`.

## Usage

Use these classes as a library, for example via maven. This library is not available in the 
central repository. But it can be included with a master maven-project like this:

    <!-- [...] !-->
    <packaging>pom</packaging>
    <modules>
        <module>instalist-comm</module>
        <module>other module</module>
    </modules>
    <!-- [...] !-->
    
Where the modules are relative paths to the modules (where a `pom.xml` is inside). Then it can be
used as a normal dependency in other modules:

    <dependency>
        <groupId>org.noorganization</groupId>
        <artifactId>instalist-comm</artifactId>
        <version>0.1-SNAPSHOT</version>
    </dependency>
