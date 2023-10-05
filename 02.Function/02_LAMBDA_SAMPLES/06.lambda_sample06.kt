fun main(args: Array<String>) {
  val reference = Double::isFinite

  println(reference(Double.MAX_VALUE))
  println(reference(Double.NaN))
}