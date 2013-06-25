Artifactory installation log:
* Artifactory was downloaded from jfrog site
* Copied to the server and unzipped in /home/carlos
* Installation as a service with the command
 ./artifactory-3.0.1/bin/installService.sh
* Started with
 /etc/init.d/artifactory start
* Now it is running at
 http://50.56.177.120:8081/

Deploy a sample library:
* A sample library is available at
 
* To build execute
 sbt>
  build

* Then publish to artifactory
 sbt>
  publish