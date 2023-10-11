fun main(args: Array<String>) {
  val immutableLst = listOf<String>("Apple", "Banana", "Candy", "Grape")
  val isExists = immutableLst.contains("Banana")

  println(immutableLst)
  println("Banana is in List? - $isExists")
  println("Popcorn is in List? - ${immutableLst.contains("Popcorn")}")
}