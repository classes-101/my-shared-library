# Jenkins Shared Library Example

This repository contains a simple shared library for Jenkins.

## Folder Structure
```
jenkins-shared-library/
│── vars/                 # Stores reusable Groovy functions
│   ├── myFunction.groovy  # Example function
│── Jenkinsfile           # Example pipeline using the shared library
│── README.md             # Documentation
```

## How to Use
1. Configure this repo as a **Global Pipeline Library** in Jenkins.
2. Use `@Library('my-shared-lib') _` in your `Jenkinsfile`.
3. Call `myFunction('Your Name')` in your pipeline.
