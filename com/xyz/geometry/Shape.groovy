package com.xyz.geometry

// a contract that subclasses must implement!
// a class with even 1 abstract method, must be marked as abstract
abstract class Shape {
  abstract def area();

  abstract def perimeter();
}
