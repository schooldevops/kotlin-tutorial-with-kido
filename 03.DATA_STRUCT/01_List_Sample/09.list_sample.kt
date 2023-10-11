fun main(args: Array<String>) {
  val mutableLst = mutableListOf<String>("Apple", "Banana", "Candy", "Grape")
  val iterator = mutableLst.listIterator()

  println("처음: " + mutableLst)
  iterator.next()
  iterator.add("FuHaHa")
  println("add(\"FuHaHa\"): " + mutableLst)
  iterator.next()
  iterator.set("BBB")
  println("set(\"BBB\"): " + mutableLst)
  iterator.next()
  iterator.remove()
  println("remove(): " + mutableLst)
}