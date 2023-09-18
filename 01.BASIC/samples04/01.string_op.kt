fun main(args: Array<String>) {
  val greeting = " Hello, My name is Kotlin. "
  val description = """
    I'm Kotlin.
    I'm from Jetbrains. Now I'm a most popular programming language.
    Kotlin is very fun.
    Kotlin is very short and fancy.
    Kotlin is functional programming language.
  """

  // 문자열 길이를 추출한다.
  fun stringLength(str: String): Int = str.length

  // 문자열을 상호 비교한다. 
  fun compareStringEachOther(str1: String, str2: String): Int = str1.compareTo(str2)

  // 문자열이 동일한지 검사한다. 
  fun equals01(str1: String, str2: String): Boolean = str1.equals(str2)
  fun equals02(str1: String, str2: String): Boolean = str1 == str2
  fun equals03(str1: String, str2: String): Boolean = str1 === str2

  // 문자열내 특정 인덱스 값을 조회한다. 
  fun getCharByIdx01(str: String, idx: Int): Char = str.get(idx)
  fun getCharByIdx02(str: String, idx: Int): Char = str[idx]
  fun getFirst(str: String): Char = str.first()
  fun getLast(str: String): Char = str.last()

  // 문자열 해시 값을 반환한다. 
  fun getHash(str: String): Int = str.hashCode()

  // 문자열을 더한다. 
  fun plusString01(str1: String, str2: String): String = str1.plus(str2)
  fun plusString02(str1: String, str2: String): String = str1 + str2

  // 하위 시퀀스를 추출한다. 
  fun subStr(str: String, start: Int, end: Int): String = str.subSequence(start, end)

  // 케이스변환
  fun strToCap(str: String): String = str.capitalize()
  fun strToDeCap(str: String): String = str.decapitalize()
  fun strToUpper(str: String): String = str.toUpperCase()
  fun strToLower(str: String): String = str.toLowerCase()

  // 공백/빈문자열처리
  fun isEmptyString(str: String): Boolean = str.isEmpty()
  fun isBlankString(str: String): Boolean = str.isBlank()
  fun trimEnd(str: String): String = str.trimEnd()
  fun trimStart(str: String): String = str.trimStart()
  fun trimAll(str: String): String = str.trim()

  // filter
  fun filteringVowels(str: String): String = str.filter{e -> e in "aeiou"}

  // 문자열교체
  fun replaceAToB(str: String, searchStr: String, replaceStr: String) = str.replace(searchStr, replaceStr)

  
}