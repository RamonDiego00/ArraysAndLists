package br.com.alura.array.teste

fun testeForEach() {
    val idades = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = 0

    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    var menorIdade = 200
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}

fun testaSalarios() {
    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento

    }

    println(salarios.contentToString())
}
