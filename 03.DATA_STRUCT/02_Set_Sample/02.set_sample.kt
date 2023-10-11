fun main(args: Array<String>) {
  var set01 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(set01)

  println("""
    Count: ${set01.count()}
    Max: ${set01.max()}
    Min: ${set01.min()}
    Sum: ${set01.sum()}
    Average: ${set01.average()}
  """)
}