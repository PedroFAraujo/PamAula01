//Duas variáveis declaradas 3(a) e 4(b)
fun main(args: Array<String>) {
    print("O menor valor é ${min(3, 4)}")
}

//Duas variáveis sendo comparadas e retorna o valor da menor
fun min(a: Int, b: Int): Int{
    return if(a < b) a else b
}