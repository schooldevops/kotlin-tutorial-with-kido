fun sum(a: Int, b: Int): Int = a + b
fun mul(a: Int, b: Int): Int = a * b

fun printOp(a: Int, b: Int, f: (Int, Int) -> Int): Int {
  println("${a}와 ${b}를 받아 함수를 실행한 결과 %d가 되었습니다.".format(f(a, b)))
  return f(a, b)
}

fun main(args: Array<String>) {
  printOp(10, 20, ::sum)
  printOp(10, 2, ::mul)  
}