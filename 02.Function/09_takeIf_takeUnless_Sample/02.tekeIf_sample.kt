fun main() {
  val str = "Hello"
  val caps = str.takeIf { it.isNotEmpty() }?.uppercase()
  //val caps = str.takeIf { it.isNotEmpty() }.uppercase() //compilation error
  println(caps)
}