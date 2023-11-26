fun copy(from: Array<out Any>, to: Array<Any?>) {
  assert(from.size == to.size) 
  for (i in from.indices) {
    to[i] = from[i]
  }
}

fun main(args: Array<String>) {
  val ints: Array<Int> = arrayOf(1, 2, 3)
  val any: Array<Any?> = arrayOfNulls(3)

  print("Ints: ")
  ints.forEach(::print)
  println()
  print("Before Any: ")
  any.forEach(::print)
  println()
  copy(ints, any)
  print("After Any: ")
  any.forEach(::print)
}