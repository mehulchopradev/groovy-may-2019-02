// good convention, the name of the class and the file in which it is contained, must be the same
// when one class per file
// Person X

// An object would be created for all the classes loaded up in the java program
// single object per class
// Class
class Student {
  // instance variables
  String name
  Character gender
  Integer roll
  Float marks

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
    this.gender = gender
    this.roll = roll
    this.marks = marks

    Student.count += 1
  }

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
}
