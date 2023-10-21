import java.time.*
fun main(args: Array<String>) {
  // OffsetDateTime --> LocalDateTime
  val offsetDateTime01 = OffsetDateTime.now();
  val localDateTime01 = offsetDateTime01.toLocalDateTime();
  val localDate = offsetDateTime01.toLocalDate()
  val localTime = offsetDateTime01.toLocalTime()

  println("OffsetDateTime: ${offsetDateTime01} | LocalDateTime: ${localDateTime01}")
  println("OffsetDateTime: ${offsetDateTime01} | LocalDate: ${localDate}")
  println("OffsetDateTime: ${offsetDateTime01} | LocalTime: ${localTime}")
}