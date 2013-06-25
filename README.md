# Summary

This is a build file for a sample library that can be imported by Venovle services.

The idea is that this library can be exported as a snapshot to a common maven repository
and then imported in the Venolve Services project.

The workflow is as follow:
* Develop a new library or update an existing one
* Compile and package as a jar using sbt
* Publish to a common maven repository (Artifactory)
* Use the library from the Venovle services project

# Deploy a sample library:
* A sample library is available at
 https://github.com/krumpi/SampleLib

* You need to add a credentials file at
 $HOME/.ivy2/.credentials

 With the following content (For venolve user)
realm=Artifactory Realm
host=50.56.177.120
user=venolve
password=******

* start sbt

* To build execute
 > package

* Then publish to artifactory
 > publish

* If everything is successful your package would be deployed to the artifactory repository and can be used in other projects

# Use from services


# Artifactory installation log:
* Artifactory was downloaded from jfrog site
* Copied to the server and unzipped in /home/carlos
* Installation as a service with the command
 ./artifactory-3.0.1/bin/installService.sh
* Started with
 /etc/init.d/artifactory start
* Now it is running at
 http://50.56.177.120:8081/
* Created a venovle account with access rights to deploy artifacts to the libs-snapshot-local repository