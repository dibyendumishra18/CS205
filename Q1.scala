class Queue(){
      var a: List[Any]=Nil
      def equals(obj:Queue):Boolean={
             (this.a, obj.a) match{
                   case(Nil,Nil) => true
                   case(h1::r1, h2::r2) => (h1.equals(h2)) && (r1.equals(r2))
                   case _ => false}
     }
      override def hashCode(): Int={
             var result: Int=0                                   
             this.a.foreach{
			result+=_.hashCode()}
             return result
     }
                   
     def Enqueue(l: Any): Unit={
	     this.a=this.a:::List(l)
     }
     def Dequeue(): Unit={
	     this.a match{
		   case Nil => this.a=Nil
		   case h::r => this.a=r }                   
     }
		
                   
}              
      



