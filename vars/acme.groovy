// vars/acme.groovy
import groovy.json.JsonSlurper
class acme implements Serializable {
    private String name
    def setName(value) {
        name = value
    }
    def getName() {
        name
    }
    def caution(message) {
        bat "echo 'Hello, ${name}! CAUTION: ${message}'"
    }
}
