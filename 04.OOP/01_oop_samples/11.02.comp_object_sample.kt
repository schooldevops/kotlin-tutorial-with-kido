class PersonComp2() {
  companion object PersonInfo {
    fun introduce() = println("Hello~ ")
  }
}

fun main(args: Array<String>) {
  PersonComp2.introduce()
}