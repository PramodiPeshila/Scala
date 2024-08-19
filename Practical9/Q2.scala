import scala.io.StdIn.readLine

object NumberClassifier {
  def main(args: Array[String]): Unit = {
    
    println("Enter an integer:")
    val input: Int = readLine().toInt
    
    input match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2==0 => println("Even number is given")
      case x if x % 2!=0=> println("Odd number is given")
    }
  }
}
