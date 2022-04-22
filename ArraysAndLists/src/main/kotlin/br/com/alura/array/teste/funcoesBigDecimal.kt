package br.com.alura.array.teste

import java.math.BigDecimal
import java.math.RoundingMode


fun calculaAumentorelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()

    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}