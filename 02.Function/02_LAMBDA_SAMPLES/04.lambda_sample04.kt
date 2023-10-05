fun main(args: Array<String>) {
  val arr_str = arrayOf("Apple", "Banana", "Grape", "PineApple")

  // 람다 함수 내부에 item 파라미터를 arr_str로 부터 전달받아 출력한다. 
  arr_str.forEach { item -> println(item) }

  println("-----------------------------------")
  
  // it를 이용하면 다음과 같이 단순한 코드가 된다. 
  arr_str.forEach { println(it) }
}