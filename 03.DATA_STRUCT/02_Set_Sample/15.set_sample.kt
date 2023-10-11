fun main(args: Array<String>) {
  val spent = setOf(1000, 5000, 1500, 7000)

  val totalCash = 20000
  val remainCash = spent.fold(totalCash) { total, next -> total - next }
  println("Remain Cash is : " + remainCash)
}