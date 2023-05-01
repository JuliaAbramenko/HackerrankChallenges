fun findZigZagSequence(a : Array<Int>) {
    a.sort()
    val result = a.copyOf()
    val k = (a.size+1)/2
    var index = 0
    for(i in 0 until (k-1)) {
        result[index] = a[i]
        index++
    }
    result[index] = a[a.size-1]
    index++
    for(i in a.size-2 downTo k-1) {
        result[index] = a[i]
        index++
    }
    println(result.joinToString(separator = " "))
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (i in 0 until t) {
        val n = readLine()!!.trim().toInt()

        val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        findZigZagSequence(a)
    }
}
