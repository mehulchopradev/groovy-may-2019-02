package com.xyz.college.domain

import com.xyz.common.DataType

// concrete class/child class/sub class
// Groovy bean
class CollegeStudent extends CollegeUser implements DataType {
  Integer roll
  Float marks

  // method overriding
  String toString() {
    "Name : ${this.name}\nGender : ${this.gender}"
  }
}
