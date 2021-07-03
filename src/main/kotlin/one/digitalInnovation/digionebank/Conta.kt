package one.digitalInnovation.digionebank

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    fun depositar(pValor : BigDecimal)
    {
        //this.saldo += pValor
    }

    fun saque(pValor : BigDecimal)
    {
        //this.saldo -= pValor
    }
}