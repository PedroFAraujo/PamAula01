fun main(args: Array<String>) {
    var contador: Int = 1
    while(contador <= 10){
        println(contador)
        contador++
    }

    var opcao: Int = 0 //Declaração da variavel opcao e atribuindo o valor 0
    while(opcao != 1){ //Loop vai continuar ate que seja atribuido o valor 1 a variavel opcao
        print("Digite um número: ")
        val line = readLine() ?: "0" //Linha de texto de console, caso o valor seja null irá atribuir o valor 0
        opcao = line.toIntOrNull() ?: 0 //Converte o valor recebido do console para String, caso seja null retornará 0
        println("Você escolheu a opção $opcao") //Exibição do numero digitado

        if(opcao == 1){
            print("Encerrando...")
        }
    }
}