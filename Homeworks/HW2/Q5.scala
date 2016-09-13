object Q5{

def pivotSort(x:List[Int], n: Int): List[Int]={

    if(x == Nil)
      x:+n
    else if(x.head<=n)
      x.head::pivotSort(x.tail, n)
    else{      
      pivotSort(x.tail, n):+x.head}}

def main(args:Array[String]):Unit={
val l1=List(1,4,9,3,7,5,10,11,13)
println(pivotSort(l1,8))}

  
}
