object Q6{
def quickSort(l:List[Int]):List[Int]={
if (l.isEmpty) 
    l
else {
    val (smaller, bigger) = l.tail partition (_ < l.head)
    quickSort(smaller) ::: l.head :: quickSort(bigger)
     }
}
def main(args:Array[String]):Unit={
val l1=List(4,2,7,1,9)
println(quickSort(l1))}
}

