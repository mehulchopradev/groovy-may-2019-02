package com.xyz.common

trait DataType {
  def getType() {
    println "Data type of this object is ${this.getClass()}"
  }
}
