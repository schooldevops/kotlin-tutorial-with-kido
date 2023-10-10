fun main(args: Array<String>) {
  val str = "Hello"

  str.run {
    // 아래 두개는 동일하다. 
    println("The string's length: $length")
    println("the string's length: ${this.length}")
  }

  println("-------------------------------------")

  str.let {
    println("The string's length is ${it.length}")
  }
}