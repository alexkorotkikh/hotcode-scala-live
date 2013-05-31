/**
 * User: alexkorotkikh
 * Date: 5/31/13
 * Time: 3:14 PM
 */
object HelloWorld {
  def main(args: Array[String]) {
    val greeter = new Greeter
    println(greeter.sayHelloTo())
  }
}

class Greeter {
  def sayHelloTo(name: String = "world") = "Hello, %s!".format(name)
}
