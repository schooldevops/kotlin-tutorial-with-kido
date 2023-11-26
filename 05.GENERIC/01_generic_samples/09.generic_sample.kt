fun <T: Comparable<T>> sort(list: List<T>): List<T> {
  return list.sorted()
}

fun main(args: Array<String>) {
  val listVal = listOf(5, 3, 4, 1, 2)

  val sortedValue = sort(listVal)
  listVal.forEach { print(it) }
  println()

  sortedValue.forEach { print(it) }
}