const val PREZZO_STANDARD = 10
const val PREZZO_RIDOTTO = 8
fun main() {
    val colonna: Int
    val riga: Int
    val disponiCinema = DisponiCinema()
    val comunicazioni = arrayOf(
        "Selezionare azione desiderata: ",
        "1 : Prenotazione biglietto",
        "2 : Calcolo guadagni per sala"
    )
    for (i in comunicazioni){
        println(i)
    }
    val input = readln().toInt()
    when(input){
        1 -> disponiCinema.stampa(readln().toInt(), readln().toInt())
        2 -> prezzoBiglietto()
    }

}

fun prezzoBiglietto(){
    val dollarSign = 36
    println("Enter the number of rows:")
    val numberOfRows = readln().toInt()
    println("Enter the number of seats in each row:")
    val numberOfSeats : Int = readln().toInt()
    val totalSeats = numberOfSeats * numberOfRows
    if (totalSeats < 60){
        println("Total income:")
        println("$${totalSeats * PREZZO_STANDARD}")
    }else if(totalSeats > 60){
        val frontSeatPrice = (numberOfRows /2) * numberOfSeats * PREZZO_STANDARD
        val backSeatPrice = (numberOfRows - (numberOfRows /2)) * numberOfSeats * PREZZO_RIDOTTO
        println("Total income:")
        val totalIncome = frontSeatPrice + backSeatPrice
        print(36.toChar()); print(totalIncome)
    }
}