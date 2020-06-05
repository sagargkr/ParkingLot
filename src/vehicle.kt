/* MIT License

Copyright (c) 2020 Sagar Gupta

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

import java.util.*

/*
 * Defining the data classes for each type of section.
 * Vehicle as base class and rest all overrides it.
 */

open class Vehicle(open val number: String, open val color: String)

data class Car(override val number: String, override val color: String) : Vehicle(number, color)

data class Bike(override val number: String, override val color: String) : Vehicle(number, color)

data class Scooter(override val number: String, override val color: String) : Vehicle(number, color)

class VehicleParking(private val amountOfSpots: Int = 0, private val type: String = "") {

    //  parking list
    private val parking: MutableMap<Int, Vehicle> = mutableMapOf()

    //  list of free spots to park vehicle in ascending order
    private fun getFreeSpot(): Int {
        for (i in 1..parking.size + 1) {
            if (parking.containsKey(i)) {
                continue
            } else {
                return i
            }
        }
        return 0
    }

    // to park a vehicle
    fun park(vehicle: Vehicle): Int {
        val freeSpot = getFreeSpot()
        if (freeSpot > amountOfSpots) return 0
        parking[freeSpot] = vehicle
        return freeSpot
    }

    // to free up a spot
    fun leave(spot: Int): Boolean {
        return if (parking.containsKey(spot)) {
            parking.remove(spot)
            true
        } else {
            false
        }
    }

    // to check if parking space is initialised or not
    fun amountOfSpotsAvailable(): Boolean {
        return amountOfSpots == 0
    }

    // to know about parked vehicle
    fun parkedVehicle() {
        if (parking.isEmpty()) {
            println("Parking lot is empty.")
        } else {
            for (i in parking.keys) {
                println("$i ${parking[i]?.number} ${parking[i]?.color}")
            }
        }
    }

    // to know about reg no of vehicles that are parked
    fun regByColor(string: String) {
        val regList: MutableList<String> = ArrayList()
        for (i in parking.keys) {
            if (parking[i]?.color == string.toLowerCase()) {
                parking[i]?.number?.let { regList.add(it) }
            }
        }
        if (regList.isEmpty()) {
            println("No $type with color $string were found.")
        } else {
            println(regList.joinToString(separator = ", "))
        }
    }

    // to know about spots occupied by a same color vehicles that are parked
    fun spotByColor(string: String) {
        val spotList: MutableList<Int> = ArrayList()
        for (i in parking.keys) {
            if (parking[i]?.color == string.toLowerCase()) {
                spotList.add(i)
            }
        }
        if (spotList.isEmpty()) {
            println("No $type with color $string were found.")
        } else {
            println(spotList.joinToString(separator = ", "))
        }
    }

    // to know about spot occupied by a vehicle that is parked
    fun spotByReg(string: String) {
        val spotList: MutableList<Int> = ArrayList()
        for (i in parking.keys) {
            if (parking[i]?.number == string) {
                spotList.add(i)
            }
        }
        if (spotList.isEmpty()) {
            println("No $type with registration number $string were found.")
        } else {
            println(spotList.joinToString(separator = ", "))
        }
    }

}