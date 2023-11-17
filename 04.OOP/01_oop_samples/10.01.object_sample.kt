object NPC001_member {
  var name: String = "NPC001"
  private var stageLevel: Int = 1 

  fun getLevel(stage: String): Int  = when {
      stage == "EASY" -> stageLevel
      stage == "NORMAL" -> stageLevel + 5
      else -> stageLevel + 20
  }
}

fun main(args: Array<String>) {
  println("object easy-level " + NPC001_member.getLevel("EASY"))
  println("object normal-level " + NPC001_member.getLevel("NORMAL"))
  println("object high-level " + NPC001_member.getLevel("HELL"))
}