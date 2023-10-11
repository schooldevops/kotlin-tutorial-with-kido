fun main(args: Array<String>) {
  val immutableLst = listOf<String>("Apple", "Banana", "Candy", "Grape")

  for (item in immutableLst) {
    println("----: " + item)
  }
}