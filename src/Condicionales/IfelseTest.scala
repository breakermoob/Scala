object ifelse {
  val n = 5
  val k = 10

  def main(args: Array[String]): Unit = {

    if (n == 5) {
      println("Sí, n vale 5")
    } else {
      if (n == 6) {
        println("Vale 6")
      } else {
        println("Tiene otro valor")
      }
    }

    if (n == 5) {
      println("Sí, n vale 5")
    } else if (n == 6) {
      println("Vale 6")
    } else {
      println("Tiene otro valor")
    }

    println(if (k == 10) "k vale 10" else "k no vale 10")
    var kValue = kVale10()
    println(kValue)

  }

  def kVale10(): String = if (k == 10) "k vale 10" else "k no vale 10"

}
