object Q2{
def split(l: List[Int]):(List[Int], List[Int]) = {
    def _split(n: Int, first: List[Int], second: List[Int]):(List[Int],List[Int]) = (n, second) match {
        case (_, Nil) => (first, Nil)
        case (0, second) => (first, second)
        case (n, hd::tail) => _split(n - 1, first:::(List(hd)), tail)
    }
    _split(l.length/2, List(), l)
}
def main(args:Array[String]):Unit={
    val l1=List(1,2)
    
    println(split(l1))
}}
