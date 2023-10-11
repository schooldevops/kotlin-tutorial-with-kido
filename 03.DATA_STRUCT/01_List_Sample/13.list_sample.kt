fun main(args: Array<String>) {
  val mutableLst = mutableListOf<String>("Apple", "Banana", "Candy", "Grape")

  println(mutableLst)
  val count = mutableLst.count()
  println("Total Cnt : " + count)

  val count2 = mutableLst.count( { it.lastIndexOf("e") > 0 } )
  println("Words end of 'e', count : " + count2)

  println("Size: " + mutableLst.size)
}