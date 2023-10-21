import java.time.Instant
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.time.ZoneId
import java.time.ZoneOffset

fun main(args: Array<String>) {

  // 시스템의 기본 오프셋 이용하기 
  val localDateTime01 = LocalDateTime.now()
  val zoneOffset01 = ZoneId.systemDefault().getRules().getOffset(Instant.now());
  val offsetDateTime01 = localDateTime01.atOffset(zoneOffset01)

  println("LocalDateTime: ${localDateTime01} --> OffsetDateTime: ${offsetDateTime01}")

  // 사용자 지정 오프셋 이용하기. 
  val zoneOffset02 = ZoneId.of("Australia/Sydney").getRules().getOffset(Instant.now());
  val offsetDateTime02 = localDateTime01.atOffset(zoneOffset02);
  println("LocalDateTime: ${localDateTime01} --> OffsetDateTime: ${offsetDateTime02}")

}