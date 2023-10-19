fun main(args: Array<String>) {

  val heros = listOf(
    "Batman",
    "Spiderman",
    "WonderWoman",
    "Ironman",
    "Superman",
  )
  println("Original: " + heros)

  println("2명씩 짝을 지으시오: " + heros.chunked(2))
  println("----------------------------------------")
  println("3명씩 윈도우를 구성해보고 각 리스트를 출력하시오. " + heros.windowed(3))

  println("-----------------------------------------")
  // partial window는 짝이 되지 않을때 부분 윈도우를 구성할 수 있도록 한다. 
  println("3명식 짝을 지을때 2스텝을 띄어서 리스트를 구성하자. " + heros.windowed(3, 2, partialWindows=true))
}