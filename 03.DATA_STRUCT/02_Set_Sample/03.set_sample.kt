fun main(args: Array<String>) {
  val words = setOf("pen", "cup", "dog", "person", "comment", "coal", "specatacles", "cup", "bread")
  println(words)

  val zeroItem = words.elementAt(0)
  println("zeroItem: " + zeroItem)

  val indexItem = words.indexOf("cup")
  println("index: " + indexItem)

  val lastIdxItem = words.lastIndexOf("cup")
  println("lastIdxItem: " + lastIdxItem)
}