class function{
  fun greet(name:String):String{
    return ("Hello $name")
    
    
  }
}

fun main(){
  val MyFunction = function()
  val result = MyFunction.greet("REX")
  println(result)
  
}
  
