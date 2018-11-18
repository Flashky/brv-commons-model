pipeline {
	agent any
	tools {
		maven 'M3_Jenkins' 
	}
	stages {
		
		stage('Clone Repository') {
			steps {
				// Get some code from a GitHub repository
				git 'https://github.com/Flashky/brv-commons-model.git'
			}

		}

		stage('Build') {
			steps {
				sh 'mvn -f brv-commons-model/pom.xml install'
			}
		}
	}
}