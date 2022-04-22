package br.com.alura.array

import br.com.alura.array.teste.*
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentorelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)


    val meses = 6.toBigDecimal()

    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoTotal)

    val media = salariosComAumento
        .sorted()
        .takeLast(3).
        toTypedArray()
        .media()
    println(media)

    val mediaMenores = salariosComAumento
        .sorted()
        .take(3).
        toTypedArray()
        .media()
    println(mediaMenores)



}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else{
        this.somatoria() / this.size.toBigDecimal()
    }
}


