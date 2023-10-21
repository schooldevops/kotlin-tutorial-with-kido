import java.time.*

fun main(args: Array<String>) {
  // epoch second로 초단위 데이터 구하기
  val localDateTime = LocalDateTime.now()
  val zoneOffset = ZoneId.systemDefault().getRules().getOffset(Instant.now());

  val epoch_seconds = localDateTime.toEpochSecond(zoneOffset)
  println("LocalDateTime: ${localDateTime} --> epoch_seconds: ${epoch_seconds}")

  // epoch millisecond로 에폭 시간 구하기. 
  val zonedDateTime = localDateTime.atZone(zoneOffset)
  val epoch_seconds02 = zonedDateTime.toEpochSecond()
  val epoch_millis = zonedDateTime.toInstant().toEpochMilli()
  println("LocalDateTime: ${localDateTime} --> epoch_seconds: ${epoch_seconds02} --> epoch_millis: ${epoch_millis}")
}