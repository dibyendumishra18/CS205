object Q2{    
       def split(l: List[Int]): (List[Int], List[Int]) = {
            val stack1 = new scala.collection.mutable.Stack[List[Int]]
            val stack2 = new scala.collection.mutable.Stack[List[Int]]
            var lst1: List[Int] = List()
            var lst2: List[Int] = List()
            var lst: List[Int] = l

            while (lst != Nil) {
                lst1 = lst1:+(lst.head)
                lst = lst.tail
                stack1.push(lst1)
                if (lst != Nil) {
                    lst2 = lst.last::lst2
                    stack2.push(lst2)
                    lst = lst.init
                }
            }
            return (stack1.pop, stack2.pop)
        }
        
       
     def main(args: Array[String]): Unit={
         println(split(List(9,8,7,6,5,4)))} //Input your own list
}


