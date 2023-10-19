data class SuperHero(val name: String, val age: Int)
data class DemiGod(val name: String, val desc: String)

fun main(args: Array<String>) {
  val heros = listOf(
    SuperHero("Batman", 45),
    SuperHero("Spiderman", 20),
    SuperHero("WonderWoman", 38),
    null,
    DemiGod("Maoi", "Moana's demi god"),
    SuperHero("Ironman", 40),
    null,
    SuperHero("Superman", 33),
    DemiGod("Hercules", "Very Strong Guy"),
    SuperHero("Cristoper", 300)
  )
  println("Original: " + heros)

  println("NotNull: " + heros.filterNotNull())
  println("Is DemiGod: " + heros.filterIsInstance<DemiGod>())
  
    // 다음은 오류가 난다. it가 Unit으로 진입이 되었고, age라는 프로퍼티를 찾을 수 없기 때문이다.
  // println("Age over 40: " + heros.filter {it.age > 40} )
}