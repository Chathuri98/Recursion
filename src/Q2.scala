import Q1._
object Q2 extends App{
  def printPrime(x:Int): Unit ={
      printPrimeNum(x,1)
    }
  def printPrimeNum(x:Int,y:Int): Unit ={
    if(x+1==y){
      return
    }
    else if(Q1.isPrime(y)){
      println(y)
    }
    printPrimeNum(x,y+1)
  }
  print("Enter the number:")
  var x=scala.io.StdIn.readInt()
  printPrime(x)
}
