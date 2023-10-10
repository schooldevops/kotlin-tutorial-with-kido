fun main() {
  // run을 객체 확장으로 사용하지 않은 케이스
  // 람다 결과를 반환하여 hexNumberRegex 변수에 담는다.
  val hexNumberRegex = run {
      val digits = "0-9"
      val hexDigits = "A-Fa-f"
      val sign = "+-"

      Regex("[$sign]?[$digits$hexDigits]+")
  }

  for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
      println(match.value)
  }
}