package JuegoDeRol

// Clase abstracta que define un personaje en el juego
abstract class Personaje(open val nombre: String, open var vida: Int) {
    abstract val tipo: String
    abstract fun atacar(): String

    fun mostrarInfo() {
        println("Nombre: $nombre")
        println("Tipo: $tipo")
        println("Vida: $vida")
    }
}

// Clase Guerrero que hereda de Personaje
class Guerrero(override val nombre: String, override var vida: Int = 100) : Personaje(nombre, vida) {
    override val tipo = "Guerrero"

    override fun atacar(): String {
        return "Ataca con espada!"
    }

}

// Clase Mago que hereda de Personaje
class Mago(override val nombre: String, override var vida: Int = 80) : Personaje(nombre, vida) {
    override val tipo = "Mago"

    override fun atacar(): String {
        return "Ataca con báculo!"
    }
}