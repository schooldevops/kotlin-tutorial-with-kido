fun main(args: Array<String>) {
  val score = 80

  when {
    score > 90 -> println("You got an A.")
    score > 80 -> println("You got an B.")
    score > 70 -> println("You got an C.")
    score > 60 -> println("You got an D.")
    else -> println("You got an F. You have to exam again.")
  }
}