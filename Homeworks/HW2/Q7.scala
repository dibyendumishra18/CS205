object Q7{
def fastPower(x:Int,n:Int):Int={
var a=1
if (n==0)
   return 1
if (n%2==0){
   a=fastPower(x,n/2)
   return a*a}
else
   return x*fastPower(x,n-1)
}
def main(args:Array[String]):Unit={
println("Enter a base :")
val input=scala.io.StdIn.readInt()
println("Enter the power :")
val power=scala.io.StdIn.readInt()
println("Answer:"+fastPower(input,power))
}}




