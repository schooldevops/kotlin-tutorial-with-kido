fun main(args: Array<String>) {
  val mutableLst = mutableListOf<String>("Apple", "Banana", "Candy", "Grape")

  println(mutableLst)

  val sliceList = mutableLst.slice(1..3)
  println(sliceList)

  val sliceWithCollection = mutableLst.slice(listOf(1, 3))
  println(sliceWithCollection)
}