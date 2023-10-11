data class Member(val name: String, val age: Int)

fun main(args: Array<String>) {
  val nums = setOf(5, 4, 3, 2, 1, 6, 7, 8, 9, 10)

  val groupByNum = nums.groupBy { it % 2 == 0 }
  println("짝수 그룹: " + groupByNum)

  val groupByNum2 = nums.groupBy { if (it % 2 == 0) "even" else "odd" }
  println("짝수 그룹: " + groupByNum2)

  val memberSets = setOf(
    Member("Superman", 20),
    Member("Batman", 40),
    Member("Spiderman", 19),
    Member("Ironman", 36),
    Member("Wonderwoman", 21)
  )

  val younAndOldHero = memberSets.groupBy { if (it.age < 40) "YoungHero" else "OldHero" }
  println("YoungHeros: " + younAndOldHero.get("YoungHero"))
  println("OldHeros: " + younAndOldHero.get("OldHero"))
}