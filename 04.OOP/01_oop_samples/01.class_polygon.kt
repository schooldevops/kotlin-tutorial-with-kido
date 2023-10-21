// Point 클래스를 정의한다. 
class Point (val x: Int = 0, val y: Int = 0) {
  // // 포인트는 좌표 x값을 가진다. 
  // val x: Int = 0
  // // 포인트는 좌표 y값을 가진다.
  // val y: Int = 0

  override fun toString(): String {
    return "Cord X: $x, Y: $y"
  }
}

// Polygon 클래스를 선언한다. 
class Polygon {

  // Polygon은 점들의 리스트를 가지고 있다. 
  var points: MutableList<Point> = mutableListOf()
  
  // 멤버 함수 선언: 포인트를 값에 할당한다. 
  fun add(point: Point): Polygon {
    points.add(point)
    return this
  }
  
  // 멤버 함수 선언: 포인트를 값에 할당한다. 
  fun add(pointParams: List<Point>): Polygon {
    points.addAll(pointParams)
    return this
  }

  // 멤버 함수 선언
  fun draw() : Unit {
    println("Draw Polygon ---------------------")
    points.forEach(::println)
  }
}

fun main(args: Array<String>) {
  // polygon object를 생성한다. 
  // class는 청사진 역할, 붕어빵틀을 의미한다. 
  // class 생성자를 이용하여 생성한 결과를 (인스턴스, object) 라고 한다. 
  val polygon = Polygon()

  // 정 사각형을 그린다. 
  polygon
    .add(Point(0, 0))
    .add(Point(10,0))
    .add(Point(10,10))
    .add(Point(0,10))
  
  polygon.draw()
}