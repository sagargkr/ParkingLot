import java.util.*

var carParking = VehicleParking()
var bikeParking = VehicleParking()
var scooterParking = VehicleParking()

val reader = Scanner(System.`in`)

fun util() {
    loop@ while (true) {
        mainMenu()
        print(">")
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
    println("\nWelcome to Car Parking\n")
    loop1@ while (true) {
        print(">")
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

fun bikeParkingLoop() {
    println("\nWelcome to Bike Parking\n")
    loop2@ while (true) {
        print(">")
        when (reader.next()) {
            "create" -> {
                val n = reader.nextInt()
                bikeParking = VehicleParking(n, "car")
                println("Created car parking lot with $n spots.")
            }
            "park" -> {
                if (bikeParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop2
                }
                val number = reader.next()
                val color = reader.next()
                val car = Car(number, color.toLowerCase())
                val parkedSpot = bikeParking.park(car)
                if (parkedSpot == 0) {
                    println("Sorry, the parking lot is full.")
                } else println("${color.capitalize()} car parked in spot $parkedSpot.")
            }
            "leave" -> {
                if (bikeParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop2
                }
                val spot = reader.nextInt()
                val result = bikeParking.leave(spot)
                if (result) println("Spot $spot is free.")
                else {
                    println("There is no car in the spot $spot.")
                }
            }
            "status" -> {
                if (bikeParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop2
                }
                bikeParking.parkedVehicle()
            }
            "reg_by_color" -> {
                if (bikeParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop2
                }
                bikeParking.regByColor(reader.next())
            }
            "spot_by_color" -> {
                if (bikeParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop2
                }
                bikeParking.spotByColor(reader.next())
            }
            "spot_by_reg"->{
                if (bikeParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop2
                }
                bikeParking.spotByReg(reader.next())
            }
            "exit" -> break@loop2
        }
    }
}

fun scooterParkingLoop() {
    println("\nWelcome to Scooter Parking\n")
    loop3@ while (true) {
        print(">")
        when (reader.next()) {
            "create" -> {
                val n = reader.nextInt()
                scooterParking = VehicleParking(n, "car")
                println("Created car parking lot with $n spots.")
            }
            "park" -> {
                if (scooterParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop3
                }
                val number = reader.next()
                val color = reader.next()
                val car = Car(number, color.toLowerCase())
                val parkedSpot = scooterParking.park(car)
                if (parkedSpot == 0) {
                    println("Sorry, the parking lot is full.")
                } else println("${color.capitalize()} car parked in spot $parkedSpot.")
            }
            "leave" -> {
                if (scooterParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop3
                }
                val spot = reader.nextInt()
                val result = scooterParking.leave(spot)
                if (result) println("Spot $spot is free.")
                else {
                    println("There is no car in the spot $spot.")
                }
            }
            "status" -> {
                if (scooterParking.amountOfSpotsAvailable()) {
                    println("Sorry, a parking lot has not been created.")
                    continue@loop3
                }
                scooterParking.parkedVehicle()
            }
            "reg_by_color" -> {
                if (scooterParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop3
                }
                scooterParking.regByColor(reader.next())
            }
            "spot_by_color" -> {
                if (scooterParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop3
                }
                scooterParking.spotByColor(reader.next())
            }
            "spot_by_reg"->{
                if (scooterParking.amountOfSpotsAvailable()){
                    println("Sorry, a parking lot has not been created.")
                    continue@loop3
                }
                scooterParking.spotByReg(reader.next())
            }
            "exit" -> break@loop3
        }
    }
}