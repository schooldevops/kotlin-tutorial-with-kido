fun main(args: Array<String>) {

  // kotlin은 기본적으로 자료형을 지정하지 않으면 컴파일 타임에 타입추론을 통해서 해당 변수의 자료형을 추측한다. 
  val total_num = 0

  // var 식별자: 타입 = 값 의 형식으로 지정된 타입의 변수에 값을 할당할 수 있다. 
  // 정수(Int) 타입으로 20이라는 값을 age에 할당한다. 
  val age: Int = 20

  // 배정도 실수 값을 할당한다. 
  val pi: Double = 3.141592

  // 단정도 실수 값을 할당한다. (단정도 실수값을 위해서 숫자에 'f'를 붙인것을 확인하자.)
  val random: Float = 12.99f

  // 문자열 값을 할당한다. 
  val myName: String = "UncleBae"

  // 여러줄 문자열
  val description: String = """Hello myName is UncleBae
  Nice to meet you.
  """

  // 불리언 값을 할당한다. 
  val isMale: Boolean = true

  // 문자 캐릭터 하나를 할당한다. 
  val genderCode: Char = 'M'

  println("Total Num: " + total_num)
  println("Age: " + age)
  println("Pi: " + pi)
  println("Random: " + random)
  println("Name: " + myName)
  println("Desc: " + description)
  println("isMale: " + isMale)
  println("Gender: " + genderCode)
  

}