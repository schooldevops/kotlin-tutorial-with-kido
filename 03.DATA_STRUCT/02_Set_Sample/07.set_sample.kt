data class Member(val name: String, val age: Int)

fun main(args: Array<String>) {
  val nums = setOf(3, 5, 1, 7, 2, 9, 10)
  println(nums)

  println("--------------- sorted")
  println(nums.sorted())

  println("--------------- reserved")
  println(nums.reversed())

  println("--------------- sortedDecending")
  println(nums.sortedDescending())

  val memberSets = setOf(
    Member("Superman", 20),
    Member("Batman", 40),
    Member("Spiderman", 19),
    Member("Ironman", 36),
    Member("Wonderwoman", 21)
  )
  
  println("--------------- Sort By name")
  val sortedByName = memberSets.sortedBy { it.name }
  sortedByName.forEach( ::println )

  println("--------------- Sort Decending By age")
  val sortedDecendingByAge = memberSets.sortedByDescending { it.age }
  sortedDecendingByAge.forEach( ::println )
}