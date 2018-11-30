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
			post {
		        always {
		        	// see: https://jenkins.io/blog/2017/02/07/declarative-maven-project/
		        	// see: https://jenkins.io/doc/pipeline/tour/tests-and-artifacts/
		            junit 'brv-commons-model/target/surefire-reports/**/*.xml'
		        }
		    }
		}
		
		stage('Nexus deploy') {
			steps {
				sh 'mvn -f brv-commons-model/pom.xml deploy'
			}
		}
	}
}