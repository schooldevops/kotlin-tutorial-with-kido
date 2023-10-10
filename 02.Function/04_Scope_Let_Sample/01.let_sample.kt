fun main(args: Array<String>) {
  val numbers = mutableListOf("one", "two", "three", "four", "five")

  println("------ 01. 일반 예제 ------")
  // 2가지 이상의 오퍼레이션이 존재하는 일반 예제
  val resultList = numbers.map { it.length }.filter { it > 3 }
  println(resultList)

  println("------- 02. let 이용 ------")

  // let을 이용하여 오퍼레이션 묶어주기 (it로 참조함을 확인하자)
  numbers.map { it.length }.filter { it > 3 }.let {
    println(it)
  }

  println("------- 03. let + 함수 레퍼런스 이용 ------")

  // 다음과 같이 함수 참조를 이용할수도 있다. (::를 이용하여 함수 참조흘 한다.)
  numbers.map { it.length }.filter { it > 3 }.let( ::println )
}