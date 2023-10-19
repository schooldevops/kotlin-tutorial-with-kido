data class SuperHeroInfo(val name: String, val age: Int, var isMale: Boolean = true)

fun main(args: Array<String>) {

  val heros = listOf(
    SuperHeroInfo("Batman", 45),
    SuperHeroInfo("Spiderman", 20),
    SuperHeroInfo("WonderWoman", 38, false),
    SuperHeroInfo("Ironman", 40),
    SuperHeroInfo("Superman", 33)
  )
  println("Original: " + heros)

  println("Is there any woman in superHeors Club? : " + heros.any { it.isMale == false })
  println("All hero's are not teen: " + heros.none { it.age <= 10} )
  println("All Hero's name is ends of man? : " + heros.all { it.name.endsWith("man")})
}