package academy.learnprogramming.oochallenge

fun main() {
    val b = KotlinBicycle(1,2,3)
    println("Speed: ${b.speed}")
    b.applyBrake(10)
    println("Speed: ${b.speed}")
    b.speedUp(20)
    println("Speed: ${b.speed}")

    b.printDescription()

    val m = KotlinMountainBike(10, 20, 30, 40)
    println("Seatheight ${m.seatHeight}")
    m.printDescription()

    val r = RoadBike(10, 20, 30, 40)
    println("TireWidth ${r.tireWidth}")
    r.printDescription()
}

class RoadBike(cadence: Int, speed: Int, gear: Int, val tireWidth: Int) : KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The roadbike has tirewidth $tireWidth")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int) : KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The mountainbike has seatheigth $seatHeight")
    }

}

open class KotlinBicycle( var cadence: Int, var speed: Int, var gear: Int) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed")
    }
}