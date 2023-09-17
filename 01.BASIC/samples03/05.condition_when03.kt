fun main(args: Array<String>) {
  checkWithWhen('A')
  checkWithWhen('B')
  checkWithWhen('C')
  checkWithWhen('D')
  checkWithWhen('F')

  checkTypeWithWhen("A")
  checkTypeWithWhen(10)
}

fun checkWithWhen(someValue: Char) {
  when(someValue) {
    'A' -> println("Scoure A. ${someValue}")
    'B' -> println("Scoure B. ${someValue}")
    'C' -> println("Scoure C. ${someValue}")
    'D' -> println("Scoure D. ${someValue}")
    else -> println("I don't know.")
  }
}

fun checkTypeWithWhen(someValue: Any) {
  when(someValue) {
    is String -> println("String. ${someValue}")
    is Int -> println("Int. ${someValue}")
    else -> println("I don't know.")
  }
}