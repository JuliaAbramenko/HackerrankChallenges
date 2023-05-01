/**
 * Converts any string in 12-hour AM/PM format to a military (24-hour) time string.
 */

fun timeConversion(s: String): String {
    var hour = s.substring(0,2).toInt()
    val minutesSeconds = s.substring(2,8)
    if(s.get(8) == 'P' && hour < 12) {
        hour += 12
    }
    if(s.get(8)== 'A' && hour == 12) {
        hour = 0
    }
    return String.format("%02d", hour) + minutesSeconds
}

fun main(args: Array<String>) {
    val s = readln()
    val result = timeConversion(s)
    println(result)
}

/*
Sample Input
07:05:45PM

Sample Output
19:05:45
 */