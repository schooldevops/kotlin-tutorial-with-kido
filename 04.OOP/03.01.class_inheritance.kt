open class BasePerson(_name: String, _age: Int) {

  val name: String = `_name`
  val age: Int = _age

  fun talk() {
    println("안녕하세요. 제 이름은 $name 이고, $age 입니다.")
  }
}

class MathTeacher(name: String, age: Int): BasePerson(name, age) {
  fun teachMath() {
    println("Teach Math.")
  }
}

class FootballPlayer(name: String, age: Int): BasePerson(name, age) {
  fun playFootball() {
    println("Play Football..")
  }
}

class Businessman(name: String, age: Int): BasePerson(name, age) {
  fun sales() {
    println("Sale.. Goods.")
  }
}

fun main(args: Array<String>) {
  val person01 = MathTeacher("Cane", 30)
  person01.talk()
  person01.teachMath()

  val person02 = FootballPlayer("Son", 33)
  person02.talk()
  person02.playFootball()
  
  val person03 = Businessman("Smith", 40)
  person03.talk()
  person03.sales()
}