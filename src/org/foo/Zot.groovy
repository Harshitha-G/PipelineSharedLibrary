// src/org/foo/Zot.groovy
package org.foo;
class Zot implements Serializable{
  def checkOutFrom(repo) {
    git url: "git@github.com:Harshitha-G/${repo}"
  }
}
