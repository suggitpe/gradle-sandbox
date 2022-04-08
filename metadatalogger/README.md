# Metadata Logger
This module is an example of how to use the gradle build to create a file to be embedded in the artefact either as a record of the build (a build stamp) or so the application can read that data and do something with it.  Salient points:
 - its is bound as a dependency to the jar phase
 - it creates a file in the output directory of build to then be copied
 - this instance reads data from the build, the local env and from git
While this has been created as an info file, it could just as easily be a properties file.