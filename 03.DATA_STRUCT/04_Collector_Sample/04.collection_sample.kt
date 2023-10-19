data class SuperHero(val name: String, val age: Int)

fun main(args: Array<String>) {
  val superHeros = listOf(
    SuperHero("Batman", 45),
    SuperHero("Spiderman", 20),
    SuperHero("WonderWoman", 38),
    SuperHero("Ironman", 40),
    SuperHero("Superman", 33),
    SuperHero("Cristoper", 300)
  )
  println("Original: " + superHeros)

  val oldHeros = superHeros.filter { it.age > 40 }

  println("OldHeros: " + oldHeros)

  val youngHeros = superHeros.filterNot { it.age > 40 }
  
  println("YoungHeros: " + youngHeros)
}