object Q1{
def fact(n : Int): Int = {
if (n==0)
   return 1
else
   return n*fact(n-1)}
def main(args:Array[String]):Unit={
println("Enter a number : ")
val input = scala.io.StdIn.readInt()
println("The factorial of "+input+" is "+fact(input))}
}
