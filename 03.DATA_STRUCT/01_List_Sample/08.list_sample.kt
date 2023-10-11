fun main(args: Array<String>) {
  val immutableLst = listOf<String>("Apple", "Banana", "Candy", "Grape")

  val iterator = immutableLst.listIterator()
  while(iterator.hasNext()) {
    println("----> " + iterator.next() + " PreIdx: " + iterator.previousIndex() + " NextIdx: " + iterator.nextIndex() )
  }
}