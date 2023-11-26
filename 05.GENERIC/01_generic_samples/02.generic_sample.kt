class Calculate2 {

  fun<A : Number> sum(a: A, b: A): A {
    return when (a) {
        is Int -> (a.toInt() + b.toInt()) as A
        is Double -> (a.toDouble() + b.toDouble()) as A
        // 다른 숫자 타입에 대한 처리 추가
        else -> throw IllegalArgumentException("Unsupported number type")
    }
  }
}

fun main(args: Array<String>) {
  val calc = Calculate2()
  
  println(calc.sum(10, 10))
  println(calc.sum(15, 15))
  // println(calc.sum("Hello ", "World"))
}