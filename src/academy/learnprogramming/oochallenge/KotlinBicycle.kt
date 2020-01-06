package academy.learnprogramming.oochallenge

fun main() {
    val b = KotlinBicycle(1,2,3)
    println("Speed: ${b.speed}")
    b.applyBrake(10)
    println("Speed: ${b.speed}")
    b.speedUp(20)
    println("Speed: ${b.speed}")

    val m = KotlinMountainBike(10, 20, 30, 40)
    println("Seatheight ${m.seatHeight}")

    val r = RoadBike(10, 20, 30, 40)
    println("TireWidth ${r.tireWidth}")
}

class RoadBike(cadence: Int, speed: Int, gear: Int, val tireWidth: Int) : KotlinBicycle(cadence, speed, gear)

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int) : KotlinBicycle(cadence, speed, gear)

open class KotlinBicycle( var cadence: Int, var speed: Int, var gear: Int) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }
}