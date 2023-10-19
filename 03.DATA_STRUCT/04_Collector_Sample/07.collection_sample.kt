data class SuperHero(val name: String, val age: Int)
data class DemiGod(val name: String, val desc: String)

fun main(args: Array<String>) {
  val randomNumbers = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 6)

  println(randomNumbers.average())

  // 4.09090909090909091
  println(randomNumbers.sum())

  val heros = listOf(
    SuperHero("Batman", 45),
    SuperHero("Spiderman", 20),
    SuperHero("WonderWoman", 38),
    SuperHero("Ironman", 40),
    SuperHero("Superman", 33),
    SuperHero("Cristoper", 300)
  )
  println("Original: " + heros)

  println("Sum of Ages: " + heros.sumOf { it.age })
  // averageOf는 없다. 하여 map로 변환하고 평균을 구하자. 
  // println("Average of Ages: " + heros.averageOf { it.age })
  println("Average of Ages: " + heros.map{ it.age }.average())

  println("Min of Ages: " + heros.minOf { it.age })
  println("Max of Ages: " + heros.maxOf { it.age })
  println("Counts: " + heros.count())
}