object SetTest {
   def main(args: Array[String]): Unit = {

      //Solo recibe valores unicos
      val set = Set(1,2,3,4,5)

      println(set(1)) //Buscar un elemento.
      println(set + 6) //Agregar un elemento.
      println(set union Set(4,5,6,7,8,9)) //Tambien podemos hacer unions e intersects entre conjuntos.
      println(set intersect Set(4,5,6,7,8,9)) 

   }
}
