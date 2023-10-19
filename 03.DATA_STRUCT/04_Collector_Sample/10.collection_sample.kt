fun main(args: Array<String>) {
  val heros = listOf(
    "Batman",
    "Spiderman",
    "WonderWoman",
    "Ironman",
    "Superman",
  )
  println("Original: " + heros)

  val herosGroup = heros.windowed(3, 2, true)
  println("herosGroup: " + herosGroup)

  println("After Flatten: " + herosGroup.flatten())

}