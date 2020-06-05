import java.util.*

val reader = Scanner(System.`in`)
var carParking = VehicleParking()
var bikeParking = VehicleParking()
var scooterParking = VehicleParking()

fun runUtil() {

    loop@ while (true) {
        mainMenu()
        println("\n>")
        when (reader.nextInt()) {
            1 -> carParkingLoop()
            2 -> bikeParkingLoop()
            3 -> scooterParkingLoop()
            4 -> commandsAvailable()
            5 -> break@loop
        }
    }
}