fun main(args: Array<String>) {
  val immutableLst = listOf<String>("Apple", "Banana", "Candy", "Grape")
  val findResults = immutableLst.filter( { it.lastIndexOf("e") > 0})

  println(findResults)

}