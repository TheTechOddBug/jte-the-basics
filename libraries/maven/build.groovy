void call(){
    sh "whoami"
    stage("Maven: Build"){
        println "build from the maven library"
    }
}
