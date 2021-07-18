object Q3 extends App{
  def addNum(x:Int):Int={
    if(x==1){
      return 1
    }
    else{
      return x+addNum(x-1)
    }
  }

  print("Enter the number:")
  var x=scala.io.StdIn.readInt()
  var sum=addNum(x)
  print(sum)
}
