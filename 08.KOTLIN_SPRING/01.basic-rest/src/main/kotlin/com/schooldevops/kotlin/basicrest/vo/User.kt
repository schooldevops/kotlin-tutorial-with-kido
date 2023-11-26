package com.schooldevops.kotlin.basicrest.vo

/**
 * User 즉, 사용자 정보를 담기 위한 데이터 클래스
 * Data class는 자동적으로 copy, equals, hashCode, toString 등을 생성한다.
 * 데이터에 널 값이 들어갈수 있도록 ? 사용하였다.
 * 이유는 사용자 정보 수정할때 값이 매핑된 사용자만 값을 업데이트 하기 위해서 사용하였다.
 */
data class User(var userId: String?, val userName: String?, val age: Int?, val phone: String?)
