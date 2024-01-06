/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {        
    }
	var i:String =readLine() ?:""//se nullo aloca string vazia
    var x:Int =i.toIntOrNull() ?:0 // se nullo passa valor 0
	    
	println(x)



/*
	for(i in 0=<..=<10 step(2)){//for normal Step para mudar incremento
    	println(i)
    }
    
    while(i<=10){
        println(i)
        i++
    }
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////////////////////////////////
    var x:Int =1
    var y:String
     
    y= if(x==1)
    	"um"
    else if(x==2)  // atribuiu Resultado da condiçao a variavel 
		"dois"    
    else ()
    	"null point exception"
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////////////////////////////////////
    //var x:Int =1
   // var y:Int =2
	
    when(x){ //switch
        1->{
            println("um") // mais de uma linha usa-se chave
        }
        2->println("dois")
        3->println("tres")
        else("null point exception")
    }
    
    
    
    
    var nome:String? //allowed Var null
    nome=null
    
    println(nome?.length) //permite operar com atributos nullos
    println(nome?.length ?:0) //operador elvis caso o atributo for nullo printa valor apos ?:
    println(nome!!.length) //garate que valor da variavel nao é nulla
    
	println("hello World")

}
