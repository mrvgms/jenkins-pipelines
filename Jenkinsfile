pipeline {
  agent any
  stages {
    stage('pull repo') {
      steps {
        git 'https://github.com/farrukh90/artemis'
      }
    }

    stage('error') {
      steps {
        sh 'echo "hello"'
      }
    }

    stage('Stage3/ Print Message') {
      steps {
        echo 'Stage 3'
      }
    }

  }
}