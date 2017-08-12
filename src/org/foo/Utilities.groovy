package org.foo
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn(args) {
    steps.bat "mvn ${args}"
  }
}
//${steps.tool 'Maven'}.\\bin\\
