def n = 8

// 0 1 1 2 3 5 8 13
// a b c
//   a b c

def a = 0
def b = 1

println a
println b

for (i in 1..n-2) {
  def c = a + b
  println c
  a = b
  b = c
}
