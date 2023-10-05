fun main(args: Array<String>) {
  val time_of_ten : (Int) -> Int = { num -> num }
  println(time_of_ten(2))

  val params_lambda : (String, Int) -> String = { str, int -> str + int }
  println(params_lambda("I'm ", 20))

  val noRet : (Int) -> Unit = { num -> println(num) } 
  noRet(100)
  
}