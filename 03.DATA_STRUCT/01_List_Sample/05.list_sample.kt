fun main(args: Array<String>) {
  
  val immutableLst = listOf<String>("Apple", "Banana", "Candy", "Grape")
  val findResult = immutableLst.find( { it.lastIndexOf("e") > 0})

  println(findResult)
}