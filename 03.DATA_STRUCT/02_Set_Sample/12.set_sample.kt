data class Member(val name: String, val age: Int)

fun main(args: Array<String>) {
  val memberSets = setOf(
    Member("Superman", 20),
    Member("Batman", 40),
    Member("Spiderman", 19),
    Member("Ironman", 36),
    Member("Wonderwoman", 21)
  )

  val youngHero = memberSets.filter { it.age < 40 }
  println("Young Hero : " + youngHero)

  val oldHero = memberSets.filterNot { it.age < 40 }
  println("Old Hero : " + oldHero)
}