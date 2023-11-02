interface A {

  fun callMe() {
      println("From interface A")
  }
}

interface B  {
  fun callMeToo() {
      println("From interface B")
  }
}

// interfaces A and B 를 동시에 구현한다. 
class Child: A, B

fun main(args: Array<String>) {
  val obj = Child()

  obj.callMe()
  obj.callMeToo()
}