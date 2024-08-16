
fun exercicio07(){
    try {
        println("Digite um número")
        val numero = readln().toInt() //readLine()"".toInt()

        //if (numero > 100 && numero <200)
        if (numero in 101..199){
            println("O número está no intervalo de 100 a 200")

        }else{
            println("Número fora da faixa")
        }

    } catch (e: NumberFormatException){
        println("Number Format Exception")
    }

}

fun exercicio10(){
    println("Digite um número de 1 a 5:")
    val numero = readln().toInt()

    when(numero){
        1 -> println("Um")
        2 -> println("Dois")
        3 -> println("Três")
        4 -> println("Quatro")
        5 -> println("Cinco")
        else -> println("Número inválido")
    }
}

fun main(){
    val letras = mutableListOf("A", "B", "C")

    letras[0] = "N"
    for (l in letras){
        println(l)
    }
}

//    var contador = 0
//    while (contador < 30){
//        contador++
//        println(contador)
//    }
//
//    do {
//        println("Do/While")
//    } while (contador > 100)

//    repeat(40){
//        println("Repeat...")
//    }

//    val nomes = arrayOf("Ana", "Pedro", "Carlos")
//    for (n in nomes){
//        println(n)
//    }




    //exercicio07()
    //exercicio10()

//    for (i in 1..50){
//        println("Índice $i")
//    }
//}

fun main2(){

    println("Digite a nota 1")
    //val nota1: Int = readLine()!!.toInt()
    val nota1: Int = readln().toInt()
    println("Digite a nota 2")
    val nota2: Int = readLine()!!.toInt()

    println("Nota 1: $nota1")
    println("Nota 2: $nota2")

    val resultado = (nota1 + nota2) / 2

    println("Resultado: $resultado")
//    if (resultado >= 6){
//        println("Aprovado!")
//    } else {
//        println("Reprovado!")
//    }
//    when(resultado){
//        6 -> println("Aprovado!")
//        5 -> println("Recuperação!")
//        else -> println("Reprovado!")
//    }
    when {
        resultado >= 6 -> println("Aprovado!")
        //resultado > 1 && resultado < 6 -> println("Recuperação!")
        resultado in 1..6 -> println("Recuperação!")
        else -> println("Reprovado!")
    }

    if (resultado in 1..6){

    }

}


fun main1() {

    val a: Int = 101
    var b: Int = 10

    val soma = a + b
    //val resto = a - b
    val multiplicado = a * b
    val dividido = a / b
    val modulo = a % b

    println("Adição: " + soma)
    println("Adição: $soma")
    println("Subtração: ${a - b}")
    println("Multiplicação: " + multiplicado)
    println("Divisão: " + dividido)
    println("Módulo: " + modulo)

    if(a >= b){
        println("A maior ou igual B")
    } else {
        if(a >= b){
            println("A maior ou igual B")
        } else {
            if(a >= b){
                println("A maior ou igual B")
            } else {
                if(a >= b){
                    println("A maior ou igual B")
                } else {
                    println("A menor que B")
                }
            }
        }
    }

}