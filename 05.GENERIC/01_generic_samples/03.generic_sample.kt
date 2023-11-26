class ClassA<A>(val value: A) {
  fun getVal(): A {
    return value
  }
}

fun main(args: Array<String>) {
  val obj = ClassA<String>("Hello World")
  println("Obj value is ${obj.getVal()}, type is ${obj.getVal()::class}")

  val obj2 = ClassA(100.5)
  println("Obj2 value is ${obj2.getVal()}, type is ${obj2.getVal()::class}")
}