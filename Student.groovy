// good convention, the name of the class and the file in which it is contained, must be the same
// when one class per file
// Person X

// An object would be created for all the classes loaded up in the java program
// single object per class
// Class

// Groovy Bean
class Student {
  // instance variables
  String name
  Character gender
  Integer roll
  Float marks

  // for each of the properties defined, Groovy bean creates automatic getter/setter function

  static Integer count = 0 // lives in the Class area (Student) of the memory

  Student() {
    // this.count += 1
    Student.count += 1 // access static variables using the class name
  }

  // constructor
  Student(String name, Character gender, Integer roll, Float marks) {
    // println this // current object
    // setting of the properties
    this.name = name
    this.setGender(gender)
    this.roll = roll
    this.marks = marks

    Student.count += 1
  }

  // always there in a groovy bean irrespective of whether we define or dont define a constructor
  /* Student(Map params) {
    this.name = params['name']
    this.gender = params['gender']
    this.roll = params['roll']
    this.marks = params['marks']
  } */

  def getDetails() {
    // this -> current object
    // String interpolation -> ""
    // GString
    "Name : ${this.name}\nGender : ${this.gender}\nRoll : ${this.roll}\nMarks : ${this.marks}"
  }

  static def getMinimumAttendance() {
    // no 'this'
    // static functions do not require to access any of the object properties
    70
  }

  // define own setter function on demand
  // Encapsulation (on demand)
  def setGender(Character gender) {
    if (gender == 'm' || gender == 'f') {
      this.gender = gender // this.setGender(gender) - does not happen as within the class. But
      // does happen when in the default map based constructor
    } else {
      this.gender = null
    }
  }
}
