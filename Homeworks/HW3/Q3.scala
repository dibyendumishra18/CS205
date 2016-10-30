object Q3{
        var t1: Long=0
        var t0: Long=0
	def main(args: Array[String]): Unit={
        println(ListSum(List(1,2,3,4,5,6,6,7,7,8,8,9,8,8,8,8,8,8,8,8)))
        println("Elapsed time: " + (t1 - t0) + "ns")
	}
	
	def ListSum(l: List[Int]): Int={
		var lst1: List[Int]=l
		var sum: Int=0
		var s: Int=0
		Console.println("Enter the number of threads: ")
		var numThreads: Int=Console.readInt
                t0 = System.nanoTime()
		var ThreadList: List[Thread]=List()
		var temp: Double=(l.length.toDouble)/(numThreads.toDouble)
		var length1: Int=math.ceil(temp).toInt
		for(i <- 1 to numThreads){
			var current: List[Int]=lst1.take(length1)
			val thread=new Thread(new Runnable {
				override def run(){
                                        def sum1(lst: List[Int]): Int={
		                                lst match{
			                            case Nil => 0
			                            case hd::rest => hd+sum1(rest)
		                                }
	                                }
					sum=sum+sum1(current)
				}
			})
			ThreadList=ThreadList:::List(thread)
			lst1=lst1.drop(length1)
		}
		ThreadList.foreach{
			_.start
		}
                t1 = System.nanoTime()
		return sum
	}
}
