package one.digitalInnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var senha : String) :
    Funcionario(
        nome,
        cpf,
        salario), Logavel {
    override fun calcularAuxilio(): Double {
        return this.salario * 0.2
    }

    override fun login(senha: String): Boolean {
        if(senha == this.senha)
            return true
        return false
    }


}