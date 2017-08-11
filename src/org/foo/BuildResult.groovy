package org.foo
import jenkins.model.Jenkins
import hudson.model.Job<JobT,RunT>
class BuildResult implements Serializable{
  def CheckForSuccess(JobName){
    def job=Jenkins.instance.getItem(JobName)
    def CurrentBuildResult=job.getLastBuild().getResult()        
    def PreviousBuildResult=job.getLastBuild().getPreviousBuild().getResult()
    if("${PreviousBuildResult}"=="FAILURE" && "${CurrentBuildResult}"=="SUCCESS" ){
      return true
    }
  }
}