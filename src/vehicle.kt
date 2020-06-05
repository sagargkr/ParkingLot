import java.util.ArrayList

/*
 * Defining the data classes for each type of section.
 * Vehicle as base class and rest all overrides it.
 */

open class Vehicle(open val number: String, open val color: String)

data class Car(override val number: String,override val color: String) : Vehicle(number, color)

data class Bike(override val number: String,override val color: String) : Vehicle(number, color)

data class Scooty(override val number: String,override val color: String) : Vehicle(number, color)

class VehicleParking(private val amountOfSpots: Int = 0, val type: String) {

    private val parking: MutableMap<Int, Vehicle> = mutableMapOf()

    private fun getFreeSpot(): Int{
        for (i in 1..parking.size+1){
            if (parking.containsKey(i)){
                continue
            } else {
                return i
            }
        }
        return 0
    }

    fun park(vehicle: Vehicle): Int{
        val freeSpot = getFreeSpot()
        if (freeSpot > amountOfSpots) return 0
        parking[freeSpot] = vehicle
        return freeSpot
    }

    fun leave(spot: Int): Boolean {
        return if (parking.containsKey(spot)){
            parking.remove(spot)
            true
        } else {
            false
        }
    }

    fun amountOfSpotsAvailable(): Boolean {
        return amountOfSpots == 0
    }

    fun parkedVehicle() {
        if (parking.isEmpty()){
            println("Parking lot is empty.")
        } else {
            for (i in parking.keys) {
                println("$i ${parking[i]?.number} ${parking[i]?.color}")
            }
        }
    }

    fun regByColor(string: String){
        val regList: MutableList<String> = ArrayList()
        for (i in parking.keys) {
            if (parking[i]?.color == string.toLowerCase()) {
                parking[i]?.number?.let { regList.add(it) }
            }
        }
        if (regList.isEmpty()){
            println("No $type with color $string were found.")
        } else {
            println(regList.joinToString(separator = ", "))
        }
    }

    fun spotByColor(string: String){
        val spotList: MutableList<Int> = ArrayList()
        for (i in parking.keys) {
            if (parking[i]?.color == string.toLowerCase()) {
                spotList.add(i)
            }
        }
        if (spotList.isEmpty()){
            println("No $type with color $string were found.")
        } else {
            println(spotList.joinToString(separator = ", "))
        }
    }

    fun spotByReg(string: String){
        val spotList: MutableList<Int> = ArrayList()
        for (i in parking.keys) {
            if (parking[i]?.number == string) {
                spotList.add(i)
            }
        }
        if (spotList.isEmpty()){
            println("No $type with registration number $string were found.")
        } else {
            println(spotList.joinToString(separator = ", "))
        }
    }

}