fun main(args: Array<String>) {
  val mutableLst = mutableListOf<String>("Apple", "Banana", "Candy", "Grape")

  println(mutableLst)
  println(mutableLst.first())
  println(mutableLst.last())
  println(mutableLst.first { it.length > 5 } )
  println(mutableLst.last { it.startsWith("C")})
  println(mutableLst.firstOrNull( { it.length > 10 }))
  println(mutableLst.firstOrNull( { it.length <= 5 }))
}