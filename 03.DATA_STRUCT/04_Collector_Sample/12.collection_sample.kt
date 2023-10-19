fun main(args: Array<String>) {
  val heros = listOf(
    "Batman",
    "Spiderman",
    "WonderWoman",
    "Ironman",
    "Superman",
  )

  val ages = listOf(
    45, 
    35,
    33,
    40,
    20,
    10
  )
  println("Original ${heros.size} : " + heros)
  println("Original ${ages.size} : " + ages)

  println(".zip() : " + heros.zip(ages))
  println("A zip B : " + (heros zip ages))

  println("-------- unzip -----------")
  val zippedValue = (heros zip ages)
  val (unzip_heros, unzip_ages) = zippedValue.unzip()

  println("unzip heros: " + unzip_heros)
  println("unzip ages: " + unzip_ages)

}