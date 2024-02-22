fun main(args: Array<String>) {
    val alunos = arrayListOf("Andre", "Carla", "Marcos") //Cria uma lista utilizando a forcao arrayListOf

    /*Loop itera sobre cada elemento da lista e associa ao índice correspondente.
    A função withIndex é usada para add um indice aos elementos da lista*/
    for ((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno \n")
    }
}