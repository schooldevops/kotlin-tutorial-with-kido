class MultiportService(var url: String, var port: Int) {
  fun prepareRequest(): String = "Default request"
  fun query(request: String): String = "Result for query '$request'"
}

fun main() {
  val service = MultiportService("https://example.kotlinlang.org", 80)

  // run을 이용하여 람다 처리 결과를 반환한다. 
  // service에 직접 run을 쓸수 있으므로 확장함수이다. 
  val result = service.run {
      port = 8080
      query(prepareRequest() + " to port $port")
  }

  // let 함수를 이용하여 동일한 결과를 출력한다. 
  val letResult = service.let {
      it.port = 8080
      it.query(it.prepareRequest() + " to port ${it.port}")
  }
  println(result)
  println(letResult)
}