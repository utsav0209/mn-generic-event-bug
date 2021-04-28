## About Repository

This repository demonstrates a bug in Micronaut Core library, where Generic Events invoke all the
possible implementation of Generic Class event listeners.

### How to run

- clone the repository
- run `./gradlew test` command to see failing tests which describe the issue
