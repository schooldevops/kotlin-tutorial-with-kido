fun main(args: Array<String>) {
  val nums = mutableSetOf(2, 4, 1, 6, 7)

  println(nums)
  nums.add(10)
  nums.add(11)
  nums.add(12)

  println("After add: " + nums)

  nums.addAll(setOf(100, 200, 300))
  println("After addAll: " + nums)

  nums.remove(100)
  println("After remove: " + nums)

  nums.retainAll(setOf(10, 11, 2, 5))
  println("After retainAll: " + nums)

  nums.clear()
  println("After clear: " + nums)

  println("Is empty? " + nums.isEmpty())
  println("Is not Empty? " + nums.isNotEmpty())
}