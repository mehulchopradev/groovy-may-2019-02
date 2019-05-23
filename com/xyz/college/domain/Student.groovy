// good convention, the name of the class and the file in which it is contained, must be the same
// when one class per file
// Person X

// An object would be created for all the classes loaded up in the java program
// single object per class
// Class

package com.xyz.college.domain

// Groovy Bean
class Student {
  // instance variables
  String name
  Character gender
  Integer roll
  Float marks
  List contactNos
  Address address
  // Student has-a Address
  // Composition relationship
  // Delete student - Delete address

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
    def part1 = "Name : ${this.name}\nGender : ${this.gender}\nRoll : ${this.roll}\nMarks : ${this.marks}\n"
    def part2 = ''

    this.contactNos.each { // null.each takes it as no iteration needed rather than flagging a error
      part2 += it + '\n'
    }

    def part3 = this.address?.getDetails() // null safe operator ?.

    part1 + part2 + (part3 ?: 'No Address!') // elvis operator ?:
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

  /* def addToContacts(String contact) {
    if (this.contactNos == null) {
      this.contactNos = []
    }

    this.contactNos << contact
  } */

  def leftShift(String contact) {
    if (this.contactNos == null) {
      this.contactNos = []
    }

    this.contactNos << contact
  }

  def rightShift(String contact) {
    if (this.contactNos) {
      this.contactNos.removeElement contact
    }
  }

  def plus(Student other) {
    if (this.contactNos) {
      this.contactNos.addAll(other.contactNos)
    }
  }
}
