package com.xyz.geometry

class Rectangle extends Shape {
  Integer length
  Integer breadth

  // must compulsorily override all the abstract methods from Shape
  def area() {
    this.length * this.breadth
  }

  def perimeter() {
    2 * (this.length + this.breadth)
  }
}
