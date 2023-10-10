fun main(args: Array<String>) {
  val numbers = mutableListOf("one", "two", "three")
  println("------ 01.with는 this를 이용하여 컨텍스트 객체를 참조한다. . -----")
  with(numbers) {
    println("'with' 는 아규먼트를 this를 통해 참조할 수 있다. $this")
    println("다음과 같이 $size 엘리먼트 개수를 가진다.")
  }

  println("------ 02.with 값 계산을 위해 참조 객체의 속성과 함수를 그대로 사용할수도 있다. -----")

  val firstAndLast = with(numbers) {
    "The first element is ${first()}"
    " the last element is ${last()}"
  }

  println(firstAndLast)
}