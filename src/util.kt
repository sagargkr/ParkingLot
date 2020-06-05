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

fun carParkingLoop() {

    loop1@ while (true) {
        println(">")
        when (reader.next()) {
            "create" -> {
                val n = reader.nextInt()
                carParking = VehicleParking(n, "car")
                println("Created car parking lot with $n spots.")
            }
            "park" -> {
                if (carParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop1
                }
                val number = reader.next()
                val color = reader.next()
                val car = Car(number, color.toLowerCase())
                val parkedSpot = carParking.park(car)
                if (parkedSpot == 0) {
                    println("Sorry, the parking lot is full.")
                } else println("${color.capitalize()} car parked in spot $parkedSpot.")
            }
            "leave" -> {
                if (carParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop1
                }
                val spot = reader.nextInt()
                val result = carParking.leave(spot)
                if (result) println("Spot $spot is free.")
                else {
                    println("There is no car in the spot $spot.")
                }
            }
            "status" -> {
                if (carParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop1
                }
                carParking.parkedVehicle()
            }
            "reg_by_color" -> {
                if (carParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop1
                }
                carParking.regByColor(reader.next())
            }
            "spot_by_color" -> {
                if (carParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop1
                }
                carParking.spotByColor(reader.next())
            }
            "spot_by_reg"->{
                if (carParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop1
                }
                carParking.spotByReg(reader.next())
            }
            "exit" -> break@loop1
        }
    }
}