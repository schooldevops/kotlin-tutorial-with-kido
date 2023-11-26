class InClass<in T> {
  fun toString(value: T): String {
    return value.toString()
  }
}

fun main(args: Array<String>) {
  val obj = InClass<Number>()
  println("Obj classType: ${obj::class} and toStringValue is ${obj.toString(10)}")
}