//questao 1 
fun main(){
    val indice:Int = 13
    var soma = 0
    var k = 0
    while(k < indice){
        k++

        soma = soma + k
    }
        println(soma)
}
//o valor final da variavel soma sera 91


//questao 2
fun isFibonacci(number: Int): Boolean {
    var a = 0
    var b = 1
    while (b < number) {
        val next = a + b
        a = b
        b = next
    }
    return number == b || number == 0
}

fun main() {
    print("Digite um número para verificar na sequência de Fibonacci: ")
    val number = readLine()?.toIntOrNull() ?: 0

    if (isFibonacci(number)) {
        println("O número $number pertence à sequência de Fibonacci.")
    } else {
        println("O número $number não pertence à sequência de Fibonacci.")
    }
}


//questao 5
fun reverseString(str: String): String {
    val sb = StringBuilder()
    for (i in str.length - 1 downTo 0) {
        sb.append(str[i])
    }
    return sb.toString()
}

fun main() {
    print("Digite uma string para inverter: ")
    val input = readLine() ?: ""
    val reversed = reverseString(input)
    println("String invertida: $reversed")
}












