fun main(args: Array<String>) {
  val scores = listOf(100, 80, 60, 77, 55, 90, 95)

  println("origin: " + scores)

  println("reduce sum: " + scores.reduce { total, score -> total + score })
  
  val fval = scores.fold(1000) { total, score -> total + score }
  println("fold sum with base 1000: " + fval)
}