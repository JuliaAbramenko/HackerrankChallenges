import java.math.RoundingMode
import java.text.DecimalFormat

/**
 * Returns the ratio of numbers in the array which were first positive, then negativ, then zero in a new line
 */
fun plusMinus(arr: Array<Int>): Unit {
    val length : Long = arr.size.toLong()
    var positiveAmount = 0.0
    var zeroAmount  = 0.0
    var negativeAmount = 0.0
    for(i in 0 until arr.size) {
        if(arr[i] > 0) positiveAmount++
        if(arr[i] == 0) zeroAmount++
        if(arr[i] < 0) negativeAmount++
    }
    val df = DecimalFormat("#.######")
    df.roundingMode = RoundingMode.CEILING
    println (df.format(positiveAmount/length))
    println(df.format(negativeAmount/length))
    println(df.format(zeroAmount/length))

}

fun main(args: Array<String>) {

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}

/*example
STDIN           Function
-----           --------
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output

0.500000
0.333333
0.166667

 */
