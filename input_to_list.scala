import scala.io.StdIn._

object HelloWorld {
	def main(args: Array[String]): Unit = {
	 println("Enter a list of numbers separated by commas:")
    val inputList = readLine().split(",").toList
    println(inputList)
	}
}


