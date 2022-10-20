pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        sh './gradlew compileJava'
      }
    }

    stage('Unit test') {
      steps {
        sh './gradlew test'
      }
    }

    stage('Test') {
      steps {
        sh './gradlew check'
      }
    }

  }
}