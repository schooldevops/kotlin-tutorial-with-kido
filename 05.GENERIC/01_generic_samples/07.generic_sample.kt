fun fill(to: Array<in Int>, value: Int) {
  to[0] = value
}

fun main(args: Array<String>) {
  val objects: Array<Any?> = arrayOfNulls(1)

  fill(objects, 1)

  assert(objects[0] == 1)
}