def n = 7

// if-else
/* if (n % 2) { // if takes in groovy truths
  println "Odd"
} else {
  println "Even"
} */

// if-else branch has single statements
// ternary operator
// def msg = n % 2 ? 'Odd' : 'Even'
// println msg

// elvis operator
// truthy condition itself is suppose to be returned
def msg = n % 2 ?: 'Even'
println msg
