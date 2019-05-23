package com.xyz.college.domain

// base class/parent class/super class
// Groovy bean
class CollegeUser { // implicitly extends Object
  // common set of attributes
  String name
  Character gender
  List contactNos
  Address address

  // common set of methods
  def getDetails() {
    def part1 = "Name : ${this.name}\nGender : ${this.gender}\n"
    def part2 = ''

    this.contactNos.each { // null.each takes it as no iteration needed rather than flagging a error
      part2 += it + '\n'
    }

    def part3 = this.address?.getDetails() // null safe operator ?.

    part1 + part2 + (part3 ?: 'No Address!\n') // elvis operator ?:
  }

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
}
