println 'Program starts..'

println 'Please enter number : '
def s = new Scanner(System.in)

// handled the exception
try {
  def i = s.nextInt()
  def message = (i % 2) ? 'Odd' : 'Even'
  println message
} catch (InputMismatchException ime) {
  println "Plese enter number"
}
  /* catch(Exception e) {
    // catch all block using java way
  } */
  /* catch(e) {
    // catch all block using groovy way
  } */

println 'Program ends..'
