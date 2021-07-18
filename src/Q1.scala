object Q1 extends App {
     def prime(x:Int,y:Int):Boolean=
     {
          if(x==y||x==2){
               true
          }
          else{
               if(x%y==0){
                   false
          }
               else{
                    prime(x,y+1)
               }
     }
}

def isPrime(x:Int):Boolean={
     var isprimeNum=prime(x,2)
     isprimeNum
}

print("Enter the number:")
var x=scala.io.StdIn.readInt()
var booleanType=isPrime(x)
print(booleanType)
}