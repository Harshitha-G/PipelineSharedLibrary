package org.foo
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def checkOutFrom(){
    steps.git "https://github.com/Harshitha-G/jenkins2-course-spring-petclinic.git"
  }
  def mvn(args) {
    steps.bat "mvn ${args}"
  }
}
//${steps.tool 'Maven'}.\\bin\\
