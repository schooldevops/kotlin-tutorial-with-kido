fun main(args: Array<String>) {
  val words = setOf("pen", "cup", "dog", "person", "comment", "coal", "specatacles", "cup", "bread")
  println(words)

  println("---------------------- For 이용한 반복 01")
  words.forEach( {println(it)} )

  println("---------------------- For 이용한 반복 02")
  for (word in words) {
    println(word)
  }

  println("---------------------- For 이용한 반복 03")
  for (i in 0 until words.size) {
    println("idx: " + i + " : " + words.elementAt(i))
  }

  println("---------------------- For 이용한 반복 04")
  words.forEachIndexed { i, e -> println("$i -> $e") }

  println("---------------------- Iterator 이용")
  val it: Iterator<String> = words.asIterable().iterator()
  while(it.hasNext()) {
    println(it.next())
  }
}