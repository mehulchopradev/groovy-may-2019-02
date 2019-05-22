def nos = [5, 6, 10, 3, 2, 7, 8, 10, 4, 9]

// get a new list from nos list consisting of evens (filterings)
def evens = nos.findAll {
  !(it % 2)
}
println evens

// get a new list from nos list consisting of squares of all elements (mapping)
def squares = nos.collect {
  it ** 2
}

println squares

// print odds greater than 5 from the nos list
nos.each {
  if (it % 2 && it > 5) {
    println it
  }
}
