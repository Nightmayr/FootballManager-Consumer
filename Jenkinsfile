node {

        withMaven(maven:'maven') {
          stage('Checkout') {
            git url: 'https://github.com/Nightmayr/FootballManager-Consumer.git', branch: 'docker-master'
        }
                
        try{
            stage('Remove') {
                sh "docker rm -vf consumer"
            }
        } catch(e) {
            build_ok = false
            echo e.toString()
        }
 
        stage('Build') {
            sh 'mvn package spring-boot:repackage'
        }
 
        stage('Image') {
            docker.build "consumer"
        }
 
        stage ('Run') {
            docker.image("consumer").run('-p 8084:8084 -h consumer --network football --name consumer')
        }
        
        stage('Prune') {
            sh 'docker image prune -f'
        }
 
    }
 
}
