const val NUMERO_DI_RIGHE = 7
const val NUMERO_DI_COLONNE = 8
class DisponiCinema {

    fun stampa(colonna: Int, riga: Int) {
        println("Cinema:")
        println("   1 2 3 4 5 6 7")
        println("  --------------")
        val seatIndicator: String = " s"
        //Loop per stampare le righe
        for (i in 1..NUMERO_DI_COLONNE) {
            print("$i|")
            val rowIdentifier: Int = i
            //Loop che stampa ogni singolo posto
            for (j in 1..NUMERO_DI_RIGHE) {
                if (i == colonna && j == riga) {
                    print(" X")
                } else {
                    print(seatIndicator)
                }
            }
            println()
        }
    }
    @Deprecated("Bug ancora non risolto", level = DeprecationLevel.WARNING)
    fun stampa() {
        println("Cinema:")
        println("  1 2 3 4 5 6 7")
        val seatIndicator: String = " s"
        //Loop per stampare le righe
        for (i in 1..NUMERO_DI_COLONNE) {
            print("$i")
            val rowIdentifier: Int = i
            //Loop che stampa ogni singolo posto
            for (j in 1..NUMERO_DI_RIGHE) {
                print(seatIndicator)
            }
        }
        println("")
    }
}