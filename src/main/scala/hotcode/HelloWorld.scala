package hotcode

import java.util.Date

object HelloWorld {
  def main(args: Array[String]) {
    "example to print"
      .fmap(String.valueOf)
      .fmap(println)
  }
}