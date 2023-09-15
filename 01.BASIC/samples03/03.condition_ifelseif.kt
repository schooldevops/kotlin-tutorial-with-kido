fun main(args: Array<String>) {
  val score = 85

  if (score > 90) {
    println("You got an A.")
  } else if (score > 80) {
    println("You got a B.")
  } else if (score > 70) {
    println("You got a C.")
  } else if (score > 60) {
    println("You got a D.")
  } else {
    println("You got a F. You have to exam again")
  }
}