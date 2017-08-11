package org.foo
class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'apache-maven-3.5.0'}/bin/mvn -o ${args}"
  }
}
