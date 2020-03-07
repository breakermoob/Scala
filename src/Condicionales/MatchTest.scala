object matchTest {
  def main(args: Array[String]): Unit = {

    val valor = 6
    println(valor match {
      case 1 => "Uno"
      case 2 => "Dos"
      case 3 => "Tres"
      case 4 => "Cuatro"
      case 5 => "Cinco"
      case 6 => "Seis"
      case _ => "Ninguno"
    })

  }
}
