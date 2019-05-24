package com.xyz.geometry

import com.xyz.common.DataType

class Square extends Shape implements DataType {
  Integer side

  // must compulsorily override all the abstract methods from Shape
  def area() {
    this.side ** 2
  }

  def perimeter() {
    4 * this.side
  }
}
