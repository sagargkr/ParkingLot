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

fun main() {

    // here the functions will be called only
    aboutProject()
    startProgram()
    util()
}

fun aboutProject() {
    println(
        """
    |                                *** PARKING LOT ***                                    
    |***************************************************************************************
    |Welcome to the Parking Lot Program, here we will be using some of the Kotlin features   
    |That will enable us to learn more about Kotlin. For how this will be basic program that
    |covers at least of 3 Kotlin's functions that are:                                       
    |1. String template                                                                      
    |2. Inheritance and                                                                     
    |3. Data Classes                                                                        
    |***************************************************************************************
    |Hope you like the project and take it up too as a beginner.                            
    |""".trimMargin()
    )
}

fun startProgram() {
    println(
        """
        |Parking space is divided into 3 sections:
        |
        |1. Cars
        |2. Scooters
        |3. Bikes
        |
        |You being a parking lot manager manages the parking lot of these. At first you need
        |to decide the total no of spots that are available for each of them separately. Each
        |of the section has to initialized and yes you can increase the size but there is also
        |a catch to it, all your parking will be wiped up because during construction you do not
        |park cars, bikes or scooters right?
        |
        |Below this you will the available commands that are for all sections but they can be used
        |for one section at a time. Ex: If you are working with the Cars section of parking then all
        |the available commands will work for Cars only. you need to exit car section to access other section.
        |
        |Please note enter text or choice after > this symbol
        |(You will also get option to see the commands with the section and exit options)
    """.trimMargin()
    )
    commandsAvailable()

}

fun commandsAvailable() {
    println(
        """
        |The commands are:
        |1. create <no of spots that you want> -> This will create the number of spots available/or to recreate spots again
        |2. park <the vehicle number plate/reg no> <vehicle color> -> This will help in parking the car (aka include spaces).
        |3. leave <spot number> -> This will help in freeing up the spot for rest of all.
        |4. status -> This will show the parked vehicle details.
        |5. reg_by_color <color name> -> This will help in knowing all same colored vehicle number in a section.
        |6. spot_by_color <color name> -> This will help in knowing all same colored vehicle spot in a section.
        |7. spot_by_reg <the vehicle number plate/reg no> -> This will help in knowing that reg number vehicle's spot in a section.
    """.trimMargin()
    )
}

fun mainMenu() {
    println(
        """
        |
        |******************************
        |*     *** MAIN MENU ***      *
        |*  1. GO TO CAR SECTION      *
        |*  2. GO TO BIKE SECTION     *
        |*  3. GO TO SCOOTER SECTION  *
        |*  4. SHOW COMMANDS AGAIN    *
        |*  5. EXIT                   *
        |******************************
        |
    """.trimMargin()
    )
}