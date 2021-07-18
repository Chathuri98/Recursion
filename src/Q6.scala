object Q6 extends App{
  def fibonacci(x:Int):Int={
    if(x==0){
      return 0
    }
    else if(x==1||x==2){
      return 1
    }
    else{
      return fibonacci(x-2)+fibonacci(x-1)
    }
  }

  print("Enter the number:")
  var x=scala.io.StdIn.readInt()

  for(i <- 0 until x){
    print(fibonacci(i)+" ");
  }
}
