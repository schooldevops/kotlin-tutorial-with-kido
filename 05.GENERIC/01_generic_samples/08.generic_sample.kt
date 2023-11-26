fun printArray(array: Array<*>) {
  array.forEach { println(it) }
}

fun main(args: Array<String>) {
  var arr = arrayOf(1, 2, "400", 5.5)
  printArray(arr)
}