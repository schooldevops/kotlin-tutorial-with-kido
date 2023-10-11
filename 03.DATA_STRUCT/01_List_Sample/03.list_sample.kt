fun main(args: Array<String>) {
  var mutLst = mutableListOf("Apple", "Banana", "Candy", "Grape")
  mutLst.add("Berry")
  println(mutLst)

  mutLst.add(1, "Strawberry")
  println(mutLst)
}