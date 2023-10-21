import java.time.*

fun main(args: Array<String>) {
  val epoch = System.currentTimeMillis()
  val epoch_seconds = (epoch / 1000) as Long
  val nano_seconds = 0

  val zoneOffset = ZoneId.systemDefault().getRules().getOffset(Instant.now())

  // epoch_seconds로 LocalDateTime구하기 
  val localDateTime = LocalDateTime.ofEpochSecond(epoch_seconds, nano_seconds, zoneOffset)
  println("Epoch: ${epoch} -> Epoch_seconds: ${epoch_seconds} -> LocalDateTime: ${localDateTime}")

  // epoch_millis 로 LocalDateTime구하기. 
  val localDateTime02 = Instant.ofEpochMilli(epoch).atZone(zoneOffset).toLocalDateTime()
  println("Epoch: ${epoch} -> Epoch_seconds: ${epoch_seconds} -> LocalDateTime: ${localDateTime02}")

}