import scala.io.StdIn.readLine

object Interest {
  def main(args: Array[String]): Unit = {
   
    val calculateInterest: Double => Double = depositAmount => {
      if (depositAmount <= 20000) {
        depositAmount * 0.02
      } else if (depositAmount <= 200000) {
        depositAmount * 0.04
      } else if (depositAmount <= 2000000) {
        depositAmount * 0.035
      } else {
        depositAmount * 0.065
      }
    }

    println("Enter the deposit Amount : ")
    val deposit=readLine().toDouble

   
   
    val interest = calculateInterest(deposit)
    println(s"The interest for a deposit of Rs. $deposit is Rs. $interest")
  }
}
