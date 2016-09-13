object Q3{
def sortInsert(n:Int,l:List[Int]):List[Int]={
l match{
  case Nil => n::l 
  case hd::rest if(n<hd) => n::l
  case hd::rest  => hd::sortInsert(n,rest)}}

def InsertionSort(l:List[Int]):List[Int]={
    if (l.isEmpty) 
        Nil
    else
       sortInsert(l.head, InsertionSort(l.tail))}

def main(args:Array[String]):Unit={
  val l1 = List(1,0,2,8,5,7,4)
  println("Enter a number: ")
  val input = scala.io.StdIn.readInt()
  println(InsertionSort(l1))}
}



