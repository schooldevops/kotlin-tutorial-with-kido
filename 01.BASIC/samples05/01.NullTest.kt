fun main(args: Array<String>) {

  var a: String = "Hello1"
  var b: String? = "World"
  b = null
  print(b)

  //  다음은 NEP가 발생하지 않고 안전한 코드가 된다. 
  //  즉 val은 한번 값을 할당하면 다시 할당이 불가능하기 때문이다.
  val l = a.length

  //  다음은 널이 될 수없어서 오류가 난다. 
  //  01.NullTest.kt:13:13: error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
  val l2 = b.length
}