fun main(args: Array<String>) {
  val numberList = mutableListOf<Double>()
  numberList.also { println("리스트 생성") }
    .apply { 
      add(3.14)
      add(1.0)
      add(80.0)
     }
     .also { println("다음으로 소트 수행") }
     .sort()
  println("최종결과: " + numberList)
}