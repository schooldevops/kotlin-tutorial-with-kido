class PersonComp() {
  fun introduce() = println("Hello person comp~ ")
}

fun main(args: Array<String>) {
  val person = PersonComp()
  person.introduce()
}