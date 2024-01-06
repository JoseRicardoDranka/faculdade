fun main() {
    val LambdaPar: (Int)-> Int ={n1->
        var r= n1%1
        
        if(r == 0)
         	print("par")
        else
        	print("impar")
    	r
    }
    
    println(LambdaPar(1000))
}