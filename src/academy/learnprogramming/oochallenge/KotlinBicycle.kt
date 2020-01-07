package academy.learnprogramming.oochallenge

fun main() {
//    val b = KotlinBicycle(1,2)
//    println("Speed: ${b.speed}")
//    b.applyBrake(10)
//    println("Speed: ${b.speed}")
//    b.speedUp(20)
//    println("Speed: ${b.speed}")
//
//    b.printDescription()
//
//    val m = KotlinMountainBike(10, 20, 30)
//    m.printDescription()
//
//    val r = RoadBike(10, 20, 40)
//    r.printDescription()


    val b = KotlinBicycle(1,2, 100, "Blå")
    b.printDescription()

    val m = KotlinMountainBike(10, 20, 30)
    m.printDescription()
    KotlinMountainBike.availableColors.forEach({println(it)})

    val r = KotlinRoadBike(10, 20, 40)
    r.printDescription()
}

class KotlinRoadBike(cadence: Int, speed: Int, val tireWidth: Int) : KotlinBicycle(cadence, speed) {
    override fun printDescription() {
        super.printDescription()
        println("The roadbike has tirewidth $tireWidth")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int) : KotlinBicycle(cadence, speed) {

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }
    override fun printDescription() {
        super.printDescription()
        println("The mountainbike has seatheigth $seatHeight")
    }

}

open class KotlinBicycle( var cadence: Int, var speed: Int, var gear: Int = 10) {

    constructor(cadence: Int, speed: Int, gear: Int, color: String): this(cadence, speed, gear) {
        println("The color is $color")
    }

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}