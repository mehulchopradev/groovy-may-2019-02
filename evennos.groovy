def n = 34
// while loop

/* def i = 0
while (i <= n) {
  if (!(i % 2)) {
    println i
  }

  i += 1
} */

// for loop
/* for (def i = 0; i <= n; i++) {
  if (! (i % 2)) {
    println i
  }
} */

// groovy for loop
for (i in 0..<n) { // n exclusive. 0..n (n inclusive)
  if (! (i % 2)) {
    println i
  }
}
