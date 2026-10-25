//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nombreTecnico: String = "Juan Pérez"
    val numeroRevisiones: Int = 10
    // String template
    println("Nombre del técnico: ${nombreTecnico} | Número de revisiones: ${numeroRevisiones}")

    // Conversión de Int a Double
    val doubleRevisiones: Double = numeroRevisiones.toDouble()
    println(doubleRevisiones)

    println("Dime temperatura: ")
    val temperatura = readln().toDouble()
    val categoria = when {
        temperatura < 40 -> "SECO"
        temperatura >= 40 && temperatura <= 70 -> "ÓPTIMO"
        else -> "HÚMEDO"
    }
    println(categoria)

    val observaciones: String? = null
    // Longitud con safe call operator (?.)
    println(observaciones?.length)
    // Valor por defecto con el operador Elvis (?:)
    println(observaciones?: 20)
}