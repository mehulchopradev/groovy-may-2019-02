import com.xyz.college.domain.CollegeUser

class PhotoSession {
  /* static def takePhoto(user) {
    if (user instanceof CollegeUser) {
      println "Photo taken of user ${user.name}"
    } else {
      println "Unable to click!"
    }
  } */

  static def takePhoto(CollegeUser user) {
    println "photo taken of user ${user.name}"
  }
}
