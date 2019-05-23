package com.xyz.college.domain

// Professor -> CollegeUser : Single Inheritance
// Professor -> CollegeUser -> Object : Multilevel inheritance
class Professor extends CollegeUser {
  List subjects

  // overrides the method from the super class
  // overriden method gets preference over the inherited method
  // signature of method to be same for a valid method override
  def getDetails() {
    // own implementation
    def part1 = super.getDetails() // call super class method and to avoid recursion
    def part2 = this.subjects?.join(',')

    part1 + (part2 ?: 'No subjects\n')
  }
}
