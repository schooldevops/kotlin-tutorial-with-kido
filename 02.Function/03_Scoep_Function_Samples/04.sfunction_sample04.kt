fun main(args: Array<String>) {
  val numbers = mutableListOf("one", "two", "three")
  val countEndsWithE = numbers.run {
    add("four")
    add("five")
    count { it.endsWith("e") }
  }

  println("e로 끝나는 단어의 총 개수는 $countEndsWithE 개 입니다.")
}