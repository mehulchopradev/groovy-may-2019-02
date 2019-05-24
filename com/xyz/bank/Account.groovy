package com.xyz.bank

class Account {
  String name
  Integer accountNo
  Double balance

  def minus(Double amt) {
    if (this.balance - amt < 1000) {
      // throw an error
      throw new IllegalStateException('Balance to be maintained')
    } else {
      this.balance -= amt
    }
  }
}
