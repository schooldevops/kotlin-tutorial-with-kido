class Calculate {
  fun sumInt(a: Int, b: Int): Int = a + b
  fun sumLong(a: Long, b: Long): Long = a + b
  fun sumStr(a: String, b: String): String = a + b
}

fun main(args: Array<String>) {
  
  val calc = Calculate()
  println(calc.sumInt(10, 10))
  println(calc.sumLong(15, 15))
  println(calc.sumStr("Hello ", "World"))
}