fun main(args: Array<String>) {
  var total_sum = 0
  total_sum += 1
  total_sum += 1

  println("total_sum " + total_sum)

  val imutable_sum = 100

  /**
   * 다음과 같은 오류가 나타난다. 
   * 01.var_val.kt:9:3: error: val cannot be reassigned
   *  imutable_sum += 10
   *  ^  
   */  
  // imutable_sum += 10

  println("imutable_sum " + imutable_sum)
}