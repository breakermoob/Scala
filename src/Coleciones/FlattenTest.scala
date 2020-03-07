object FlattenTest {
     def main(args: Array[String]): Unit = {
      
      val lista = List(List(1,2,6), List(2,3,5))

      println(lista.map{(x: List[Int]) => x.map{ n => n*2}})

      //Podemos aplastar la lista usando .flatten Esta recibe una lista de listas
      println(lista.map{(x: List[Int]) => x.map{ n => n*2}}.flatten)
      
      //O utilizando el Flatmap, en el caso de flatmap, no es necesario que sea una lista de listas
      println(lista.flatMap{(x: List[Int]) => x.map{ n => n*2}})

      val coches = List("BMW" , "Mercedez", "Toyota")
      //En este ejemplo le estamos enviando indirectamente una lista de listas, ya que cada string seria una lista de chars
      //Este ejemplo saca en mayusculas las letras de las listas sin repetir. 
      println(coches.flatMap{_.toUpperCase()}.distinct)
      
   }
}
