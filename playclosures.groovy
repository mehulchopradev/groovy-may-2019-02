def abc() {
  def c1 = { println it ** 2 } // closure object
  c1 // a closure object can be returned from a function
}

def c = abc()
c(3)


def pqr(x) {
  def c2 = { println it ** 2 + x} // a closure can access its enclosing function local variables
  c2
}

def cc = pqr(5)
cc(3)
cc(4)


def xyz(i, cl) {
  println i
  cl(i ** 2)
}

// can pass a closure as an argument to a function
xyz(4) {
  println it + 1
}


def x = 5
// println x + 1
// println x + 3


def incrByY(y) {
  {x -> println x + y}
}

def incrByOne = incrByY(1)
def incrByThree = incrByY(3)

incrByOne(x)
incrByThree(x)
