
class Person(var name: String, var age: Int, var location: String) {
  fun moveTo(location: String) {
    this.location = location
  }

  fun incrementAge() {
    this.age += 1
  }

  override fun toString() : String {
    return "Name: ${this.name}, Age: ${this.age}, Location: ${this.location}"
  }
}

fun main(args: Array<String>) {

  // 일반적인 방식으로 Person 객체를 이용하는 경우 
  val alice = Person("Alice", 20, "Amsterdam")
  println(alice)
  alice.moveTo("London")
  alice.incrementAge()
  println(alice)

  println("---------------------------------")

  // let 범위지정 함수를 이용한경우 
  Person("Alice2", 30, "Amsterdam").let {
    println(it)
    it.moveTo("London")
    it.incrementAge()
    println(it)
  }
  
}