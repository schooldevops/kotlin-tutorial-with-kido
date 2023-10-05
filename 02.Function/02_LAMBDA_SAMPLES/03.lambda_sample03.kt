fun string_extends(str: String, num: Int) : String {
  val plus2 : String.(Int) -> String = { this + it }

  return str.plus2(num)
}

fun main(args: Array<String>) {
  println(string_extends("Hello ", 20))
}