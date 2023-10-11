fun main(args: Array<String>) {
  val mutableLst = mutableListOf<String>("Apple", "Banana", "Candy", "Grape")

  println(mutableLst)
  val subLst = mutableLst.subList(1, 4)
  println(subLst)
}