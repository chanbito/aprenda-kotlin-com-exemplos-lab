// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel ,var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        if(!inscritos.contains(usuario))
			inscritos.add(usuario)
    }
    override fun toString(): String {
        return "[Formacao: ${this.nome}][nivel: ${this.nivel}][conteudos: $conteudos}][inscritos: ${this.inscritos}]"
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudos = mutableListOf(
    	ConteudoEducacional("Lógioca 1",30),
    	ConteudoEducacional("Matematica aplicada",40),
    	ConteudoEducacional("Compiladores"))
    
    val DIO = Formacao("TI", Nivel.INTERMEDIARIO, conteudos)
    
    DIO.matricular(Usuario("Sherlock Homes"))
    DIO.matricular(Usuario("Anakin skywalker"))
    DIO.matricular(Usuario("Cebolinha"))
    println(DIO)
    
}
