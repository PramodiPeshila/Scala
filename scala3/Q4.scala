
def sumOfEvenNumbers(numbers: List[Int]): Int = {
  var result = numbers.filter(_ % 2 == 0).sum
  result
}


