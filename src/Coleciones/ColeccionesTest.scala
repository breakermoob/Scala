import scala.collection.mutable

object ColeccionesTest {
   //scala.collection.immutable.
   //scala.collection.mutable.

  def main(args: Array[String]): Unit = {

   //Scala infiere tipos y si los elementos son de diferentes tipos dira que es any.
   //Aunque si utilizamos Tipos que esten en el rango de los AnyVal hará una inferencia de ese tipo. 
   val frutas = Array("Pera", "Manzana", "Naranja")
   println(frutas.length)   //Tamaño
   println(frutas.apply(1)) //Posición
   println(frutas(1))       // Otra forma de escribir la posición
   println(frutas.isEmpty)  //Si esta vacio
   println(frutas.nonEmpty)  //Si no esta vacio
   
   println(frutas.indexOf("Pera"))  //Posición de un objeto
  }

}
