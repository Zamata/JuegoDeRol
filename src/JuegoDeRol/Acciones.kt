package JuegoDeRol

// Interfaz que define las acciones de los personajes
interface MagiaPersonaje {
    fun castear(): String
}

// Implementación de la interfaz MagiaPersonaje en la clase Mago
class MagiaBasicaMago : MagiaPersonaje {
    override fun castear(): String {
        return "Lanza curación NIVEL I"
    }
}