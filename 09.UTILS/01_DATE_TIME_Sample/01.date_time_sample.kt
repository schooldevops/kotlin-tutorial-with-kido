import java.util.*
import java.time.*

fun main(args: Array<String>) {
  // 날짜타입 생성
  val now01 = Date()
  val now02 = ZonedDateTime.now()
  println("Date: ${now01} | ZonedDateTime: ${now02}")

  // 특정 날짜 생성 
  val birthDay01 = GregorianCalendar(2023, Calendar.DECEMBER, 20, 10, 10, 10)
  val birthDay02 = LocalDateTime.of(2023, Month.DECEMBER, 20, 10, 10, 10)
  println("GregorianCalendar: ${birthDay01.time} | LocalDate.of: ${birthDay02}")

  // 월 가져오기 
  val month01 = GregorianCalendar().get(Calendar.MONTH)
  val month02 = LocalDateTime.now().month
  println("GregorianClandar: $month01 | LocalDateTime.now().month: ${month02}")

  // 날자 연산
  val calendar01 = GregorianCalendar()
  calendar01.add(Calendar.HOUR_OF_DAY, -5)
  val calculatedDate01 = calendar01.time
  val calculatedDate02 = LocalDateTime.now().minusHours(5)

  println("Sub Time with GregorianCalendar: ${calculatedDate01} | LocalDateTime.now().minusHours(5) : ${calculatedDate02}")

  // 특정 월/일 변경하기
  val calendar03 = GregorianCalendar()
  calendar03.set(Calendar.MONTH, Calendar.JUNE)
  val calculatedDate03 = calendar01.time
  val calculatedDate04 = LocalDateTime.now().withMonth(Month.JUNE.value)

  println("Month sub: ${calculatedDate03} | LocalDateTime.now().withMonth(...) : ${calculatedDate04}")
  
  // 타임존 변경
  val calendar04 = GregorianCalendar();
  calendar04.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"))
  val calculatedDate06 = calendar04.getTime();
  val calculatedDate07 = LocalDateTime.now().atZone(ZoneId.of("Asia/Seoul"))

  println("Zone GregorianCalendar: ${calculatedDate06} | LocalDateTime.atZone: ${calculatedDate07}")

}