fun pass_lambda(compare: (Int, Int) -> Boolean) : Boolean {
  return compare(100, 100)
}

fun main(args: Array<String>) {
  val compare : (Int, Int) -> Boolean = { int1, int2 -> int1 == int2 }

  println(pass_lambda(compare))
}