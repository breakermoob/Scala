object WhileTest {
  def main(args: Array[String]): Unit = {

    var k = 0;

    while (k < 5) {
      println("k vale " + k) //Igual que en java
      println(s"k vale $k") //Interpolación de cadenas
      //Las llaves no son necesarias, pero podemos utilizarlas para evaluar cadenas
      println(s"El siguiente es ${k + 1}")
      k = k + 1
    }

    k = 0;

    do {

      println(s"k vale $k")

      k = k + 1
    } while (k < 5)

  }
}
