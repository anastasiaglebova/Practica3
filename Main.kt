import java.util.*
import kotlin.math.sqrt
fun main() {
   //zd 1
    val myAge = 18
    val isTeenager = 13<= myAge && myAge <=19
    println(isTeenager)

    //zd 2
    val theirAge = 30
    val bothTeenagers = 13 <= theirAge && theirAge <=19 && isTeenager
    println(bothTeenagers)

    //zd
    val reader = "Анастасия"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    println(authorIsReader)

    //zd 4
    val readerBeforeAuthor = reader < author
    println(readerBeforeAuthor)

    //zd 5
    val myAge2 = 18
    if (13 <= myAge2 && myAge2 <= 19)
        println("Подросток")
    else println("Не подросток")

    //zd 6
    val answer = if (13 <= myAge2 && myAge2 <= 19) println("Подросток") else println("Не подросток")
    println(answer)

    //zd 7
    var counter = 0
    while (counter < 10)
    {
        println(counter)
        counter += 1
    }

    //zd 8
    counter = 0
    var roll: Int = 0
    do {
        roll = Random().nextInt(6)
        counter += 1
        println ("После $counter бросков, roll = $roll")
    }
        while (roll!=0)

    //zd 9
    val range = 1..10
    for (i in range)
        println(i*i)

    //zd 10
    for (i in range)
        println(Math.sqrt(i.toDouble()))

    //zd 11
    var sum = 0
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
}