/**
 *  1. initial STRING s
 *  2. number of digits to rotate the initial string INTEGER k
 */

fun caesarCipher(s: String, k: Int): String {
    var resultString = ""
    for(c in s) {
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            val letterA = if(c <= 'Z') 'A' else 'a'
            val newLetter = (((c + k) - letterA) % 26) + letterA.code
            resultString += newLetter.toChar()
        }
        else resultString += c

    }
    return resultString

}

fun main(args: Array<String>) {

    val s = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}
/*
Sample Input
11
middle-Outz
2

Sample Output
okffng-Qwvb
 */