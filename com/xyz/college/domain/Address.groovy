package com.xyz.college.domain

// Groovy bean
class Address {
  String country
  String state
  String city
  String pincode

  String getDetails() {
    "Country: ${this.country}\nState: ${this.state}\nCity: ${this.city}"
  }
}
