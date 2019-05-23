package com.xyz.college.domain

// concrete class/child class/sub class
// Groovy bean
class CollegeStudent extends CollegeUser {
  Integer roll
  Float marks

  // method overriding
  String toString() {
    "Name : ${this.name}\nGender : ${this.gender}"
  }
}
