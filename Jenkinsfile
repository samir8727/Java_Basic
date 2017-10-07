//JenkinsFile
node{
	stage('Git checkout'){//for display purpose
	echo 'Checkout Code and Clone it inside Jenkins workplace'
	git 'https://github.com/samir8727/Java_Basic.git'

	}

	stage('Build,Test & Package'){
	echo 'Build the package' //for display purpose
	sh 'mvn clean compile '
	}
	stage ('Result'){
	echo 'Test result are reported'
	}

	stage ('Deploy to Dev '){
	echo 'Deploy to Dev environment'
	}
	stage('Deploy to Test'){
	echo 'Deploy to test environment'
	}
	stage ('Test Automation'){
	echo 'Deploy to Dev environment'
	}
}
