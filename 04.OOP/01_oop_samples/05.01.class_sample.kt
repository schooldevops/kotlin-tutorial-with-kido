interface Human {
  val racial: String

  fun talk(): String
  fun walk(): Unit
  fun introduce(): Unit {
    println("저는 $racial 인입니다.")
  }
}

class Asian: Human {
  override val racial: String = "Korean"
  override fun talk(): String = "안녕하세요."
  override fun walk(): Unit = println("총총총 !!.")

}

fun main(args: Array<String>) {
  val korean = Asian()
  println("korean: " + korean)
  println("Racial: " + korean.racial)
  println("Talk(): " + korean.talk())
  korean.walk()
  korean.introduce()
}