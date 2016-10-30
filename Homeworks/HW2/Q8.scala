object Q8{



def permutationGen(l:List[Int]):List[List[Int]] = {
  def mix(x:Int, l:List[Int]):List[List[Int]] = {
  l match { 
    case Nil => List(List(x))
    case (head::tail) =>
      (x :: head :: tail) :: mix(x, tail).map(head :: _)
  }}
  l match {
    case Nil => List(List())
    case (head::tail) =>
      for(p0 <- permutationGen(tail); p1 <- mix(head, p0)) yield p1
  }
}

def main(args:Array[String]):Unit={
  val l=List(1,2,1)
  println(permutationGen(l).distinct)}}
