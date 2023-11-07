fun String.findAll(findSet: Set<String>): Set<String> {
  var findedSet = mutableSetOf<String>()

  val wantSets = findSet.map { it.lowercase() }
  val substr = this.split(" ")
  for (item in substr) {
    if (wantSets.contains(item.lowercase())) {
      findedSet.add(item)
    }
  }

  return findedSet
}

fun main(args: Array<String>) {
  val sentence = "Apple is a Fruits but Lion is a Animal. And then What kind of species is a Monkey?" 
  println(sentence.findAll(setOf("Apple", "Fruits", "LION", "Kinkong")))
}