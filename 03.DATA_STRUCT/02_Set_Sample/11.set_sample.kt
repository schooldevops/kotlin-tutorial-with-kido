data class Member(val name: String, val age: Int)

fun main(args: Array<String>) {
  val nums = setOf(5, 6, 19, 3, 11, 1, -4)

  println("최대값: " + nums.max())
  println("최소값: " + nums.min())

  val memberSets = setOf(
    Member("Superman", 20),
    Member("Batman", 40),
    Member("Spiderman", 19),
    Member("Ironman", 36),
    Member("Wonderwoman", 21)
  )

  println("최 연장 히어로: " + memberSets.maxBy { it.age })
  println("최 연소 히어로: " + memberSets.minBy { it.age })
}