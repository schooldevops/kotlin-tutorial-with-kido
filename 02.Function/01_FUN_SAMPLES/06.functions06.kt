fun sum(a: Int, b: Int): Int = a + b
fun sub(a: Int, b: Int): Int = a - b
fun mul(a: Int, b: Int): Int = a * b
fun div(a: Int, b: Int = 1): Int = a / b
fun etc(a: Int, b: Int): Int = a

fun getOp(op: Char): (Int, Int) -> Int {
  when(op) {
    '+' -> return ::sum
    '-' -> return ::sub
    '*' -> return ::mul
    '/' -> return ::div
    else -> return ::etc
  }
}

fun main(args: Array<String>) {
  println("sum is %d".format(getOp('+')(10, 20)))
  println("sub is %d".format(getOp('-')(10, 20)))
  println("mul is %d".format(getOp('*')(10, 20)))
  println("div is %d".format(getOp('/')(10, 2)))
}