package org.foo
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn(args) {
    steps.bat "${steps.tool 'Maven'}.\\bin\\mvn ${args}"
  }
}
