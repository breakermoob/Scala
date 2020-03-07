object MapTest {
  def main(args: Array[String]): Unit = {

    val numeros = List(4, 8, 15, 16, 23, 42);
    //Queremos obtener una lista que contenga el doble de estos List(8, 16, 30 , 32, 46, 84)

    //Funcion lambda Funcion anonima
    //Map itera en cada elemento de la lista y ejecuta la función anonima
    val dobles = numeros.map { x => 2 * x }
    println(dobles)

   val marcas = List("bmw", "renault", "mazda", "toyota");
   val mayus = marcas.map { x => x.toUpperCase() }
   println(mayus)

   //Tambien podemos hacerlo así, para tomarlos todos
   val allMayus = marcas.map { _.length() }
   println(allMayus)


  }
}
