fun main(args: Array<String>) {
  val str1 = " Hello, My name is Kotlin. "
  val str2 = """
    I'm Kotlin.
    I'm from Jetbrains. Now I'm a most popular programming language.
    Kotlin is very fun.
    Kotlin is very short and fancy.
    Kotlin is functional programming language.
  """
  var str3 = "Apple, Banana, Peach, Graph"

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
  fun subStr(str: String, start: Int, end: Int): CharSequence = str.subSequence(start, end)

  // 케이스변환
  fun strToCap(str: String): String = str.replaceFirstChar{it.uppercase()}
  fun strToDeCap(str: String): String = str.replaceFirstChar{it.lowercase()}
  fun strToUpper(str: String): String = str.uppercase()
  fun strToLower(str: String): String = str.lowercase()

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

  // 문자열 분할 
  fun splitString(str: String, delim: String): List<String> = str.split(delim) 

  // 문자열 패딩처리 
  fun padding(str: String, padSize: Int, padChar: Char): String = str.padStart(padSize, padChar)

  // 문자열 포매팅 
  fun formatStr(srcStr: String, function: String, result: Any) = println("\'${srcStr}\' 로 들어온 문자열이 ${function} 을 거쳐 ${result} 결과가 되었 습니다.")

  formatStr(str1, "문자열 길이체크 (length) ", stringLength(str3))
  formatStr(str1, "문자열 상호비교 (compareStringEachOther) ", compareStringEachOther(str1, str1))
  formatStr(str1, "문자열 \'${"A" + str1}\' 상호비교 (compareStringEachOther) ", compareStringEachOther(str1, "A" + str1))
  formatStr(str1, "문자열 \'${"Z" + str1}\' 상호비교 (compareStringEachOther) ", compareStringEachOther(str1, "Z" + str1))
  formatStr(str1, "문자열 비교 (str1.equals(str2)) ", equals01(str1, str1))
  formatStr(str1, "문자열 비교 (str1 == str2) ", equals02(str1, str1))
  formatStr(str1, "문자열 비교 (str1 === str2) ", equals03(str1, str1))
  formatStr(str1, "문자열 인덱스 문자조회 (getCharByIdx01) ", getCharByIdx01(str1, 2))
  formatStr(str1, "문자열 인덱스 문자조회 (getCharByIdx02) ", getCharByIdx02(str1, 2))
  formatStr(str1, "문자열 첫번째 문자 (getFirst) ", getFirst(str1))
  formatStr(str1, "문자열 마지막 문자 (getLast) ", getLast(str1))
  formatStr(str1, "문자열 해시 (getHash) ", getHash(str1))
  formatStr(str1, "문자열 \'End.\'더하기 (plusString01) ", plusString01(str1, "End."))
  formatStr(str1, "문자열 \'End.\'더하기 (plusString02) ", plusString02(str1, "End."))
  formatStr(str1, "문자열 하위 시퀀스 조회 (subStr) ", subStr(str1, 2, 5))

  formatStr(str1, "문자열 첫글자 대문자 (strToCap) ", strToCap(str1))
  formatStr(str1, "문자열 첫글자 소문자 (strToDeCap) ", strToDeCap(str1))
  formatStr(str1, "문자열 대문자로 변경 (strToUpper) ", strToUpper(str1))
  formatStr(str1, "문자열 소문자로 변경 (strToLower) ", strToLower(str1))
  
  formatStr(str1, "문자열 빈문자열인지 검사 (isEmptyString) ", isEmptyString(str1))
  formatStr(str1, "문자열 블랭크 문자열인지 검사 (isBlankString) ", isBlankString(str1))
  formatStr(str1, "문자열 끝문자 트림 (trimEnd) ", trimEnd(str1))
  formatStr(str1, "문자열 시작문자 트림 (trimStart) ", trimStart(str1))
  formatStr(str1, "문자열 양쪽끝 트림 (trimAll) ", trimAll(str1))

  formatStr(str1, "문자열 모음검사 (filter) ", filteringVowels(str1))
  formatStr(str1, "문자열 문자교체 (replace) ", replaceAToB(str1, "My", "----"))
  formatStr(str1, "문자열 문자열 분할 (splitString) ", splitString(str3, ","))
  formatStr(str1, "문자열 패딩 (padding) ", padding("1", 10, '0'))

  
}