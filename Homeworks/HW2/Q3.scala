object Q3{
def sortInsert(n:Int,l:List[Int]):List[Int]={
l match{
  case Nil => n::l 
  case hd::rest if(n<hd) => n::l
  case hd::rest  => hd::sortInsert(n,rest)}}
def main(args:Array[String]):Unit={
  val l1 = List(1,4,8)
  println("Enter a number: ")
  val input = scala.io.StdIn.readInt()
  println(sortInsert(input,l1))
}}

