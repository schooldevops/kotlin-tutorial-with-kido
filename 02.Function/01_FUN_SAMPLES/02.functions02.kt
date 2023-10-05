fun calculator(a: Int, b: Int, op: String): Int {
  when(op.lowercase()) {
    "sum" -> return (a + b)
    "sub" -> return (a - b)
    "mul" -> return (a * b)
    "div" -> return (a / b)
    else -> return -999
  }
}

fun main(args: Array<String>) {
  println("SUM: %d".format(calculator(10, 5, "SUM")))
  println("SUB: %d".format(calculator(10, 5, "SUB")))
  println("MUL: %d".format(calculator(10, 5, "MUL")))
  println("DIV: %d".format(calculator(10, 5, "DIV")))
  println("ELSE: %d".format(calculator(10, 5, "?")))
}