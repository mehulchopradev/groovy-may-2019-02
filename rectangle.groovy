// groovy scripts

def perimeter(length, breadth) {
  2 * (length + breadth)
}

def area(length, breadth) {
  length * breadth
}

def l1 = 4
def b1 = 3

def p = perimeter l1, b1
def a = area l1, b1

println p
println a
