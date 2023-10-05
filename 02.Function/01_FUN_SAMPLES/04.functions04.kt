fun anyTypeArg(a: Any): Unit {
  when(a) {
    is Int -> println("${a}는 정수형 아규먼트입니다.")
    is String -> println("${a}는 문자형 아규먼트입니다.")
    else -> println("${a}는 취급하지 않는 아규먼트입니다.")
  }
}

fun main(args: Array<String>) {
  anyTypeArg(100)
  anyTypeArg("Hello")
  anyTypeArg(10.0f)
}
