package JuegoDeRol

fun main() {
    // Crear personajes
    val guerrero = Guerrero(nombre = "Arthur")
    val mago = Mago(nombre = "Merlín")

    // Mostrar información de los personajes
    println("== Información del Guerrero ==")
    guerrero.mostrarInfo()
    println(guerrero.atacar())
    println()

    println("== Información del Mago ==")
    mago.mostrarInfo()
    println(mago.atacar())
    val magiaI = MagiaBasicaMago()
    println(magiaI.castear())
}