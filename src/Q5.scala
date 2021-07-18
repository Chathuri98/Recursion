import Q4._
object Q5 extends App{
  def sumEven(x:Int):Int={
    if(x==1){
      return 0
    }
    else if(Q4.isEvenOdd(x)){
      return x+sumEven(x-1)
    }
    else{
      sumEven(x-1)
    }
  }

  print("Enter the Number:")
  var x=scala.io.StdIn.readInt()
  var sum=sumEven(x)
  print(sum)
}
