class Person4 {
  var firstName: String
  var age: Int
  var address: String
  var birthday: String = ""

  init {
    firstName = "UNKNOWN"
    age = 0
    address = "NONE"
  }

  constructor(_firstName: String, _age: Int, _address: String, _birthday: String) {
    this.firstName = _firstName
    this.age = _age
    this.address = _address
    this.birthday = `_birthday`
  }

  constructor(_firstName: String) {
    this.firstName = `_firstName`
  }
}

fun main(args: Array<String>) {
  val person1 = Person4("uncleBae", 30, "Location 000", "19800101")
  println("Person1 name: ${person1.firstName}, age: ${person1.age}, address: ${person1.address}, birthday: ${person1.birthday}")

  val person2 = Person4("uncleBae")
  println("Person2 name: ${person2.firstName}, age: ${person2.age}, address: ${person2.address}, birthday: ${person2.birthday}")
}