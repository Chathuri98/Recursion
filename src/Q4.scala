object Q4 extends App{
  def isEvenOdd(x:Int):Boolean={
    if(x%2==0){
      return true
    }
    else{
      return false
    }
  }

  print("Enter the number:")
  var x=scala.io.StdIn.readInt()
  var booleanValue=isEvenOdd(x)
  if(booleanValue){
    print("Even")
  }
  else{
    print("Odd")
  }
}
