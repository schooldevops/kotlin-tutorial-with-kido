class OutClass<out T>(private val value: T) {
  fun getVal(): T {
    return value
  }
}

fun main(args: Array<String>) {
  val obj: OutClass<Any> = OutClass("Hello World")
  println("Obj value is ${obj.getVal()}, type is ${obj.getVal()::class}")

  val obj2: OutClass<String> = OutClass("Hello World")
  println("Obj2 value is ${obj2.getVal()}, type is ${obj2.getVal()::class}")
}