// list
// ordered collection of elements
// it supports indexing (negative indexing)
// mutable
// creates an object ArrayList

def nos = [5, 6, 10, 3, 2, 7, 8, 10, 4, 9]

// higher order function
// common things to be done on the list
def filter (list, lfn) {
  def filteredList = []

  for (ele in list) {
    if (lfn(ele)) {
      filteredList << ele
    }
  }
  return filteredList
}

// define lower order functions (changing code) and pass them to the higher order functions

// get a new list from nos list consisting of only the even pointers (filtering)
/* def filterEvens(element) {
  !(element % 2)
} */

// closures
// is very much like a function - a piece of code
// is treated as first class object
def filterEvens = {element ->
  !(element % 2)
}

// filter(nos, filterEvens) // cannot pass filterEvens as functions are not treated as objects
/* def evens = []
for (n in nos) {
  if (!(n % 2)) {
    evens << n
  }
}

println evens */

println filter(nos, filterEvens) // here it is a closure (object)
// passing a callback to a function


// get a new list from nos list consisting of only the odd pointers greater than 5 (filtering)
/* def odds = []
for (n in nos) {
  if (n % 2 && n > 5) {
    odds << n
  }
}

println odds */
/* def oddsMoreThan5 = {element->
  (element % 2) && (element > 5)
} */

println filter(nos) {
  it % 2 && it > 5
} // implicit variable in closure that takes only 1 argument (item)
