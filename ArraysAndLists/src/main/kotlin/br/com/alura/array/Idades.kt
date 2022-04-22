package br.com.alura.array

fun main() {

    val idades:IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Media: $media")

    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores $todosMaiores" )

    val existeMaior = idades.any {it >= 18}
    println("Algum aluno é maior de idade $existeMaior")

    val filtroMaiores = idades.filter { it >= 18 }
    println("Maiores:$filtroMaiores")

    val busca = idades.find { it == 18 }
    println("Tem 18:$busca")
}