/**
 * Given an array of integers, where all elements but one occur twice, the unique element is returned
 */
fun lonelyInteger(a: Array<Int>): Int {

    val hashMap = HashMap<Int, Int>()
    for(element in a) {
        hashMap.put(element, hashMap.getOrDefault(element, 0) + 1)
    }
    for((key, value) in hashMap) {
        if(value == 1) {
            return key
        }
    }
    return -1

    /*
    ALTERNATIVE:
    a.sort()
    var uniqueInt : Int = 0
    if(a.size == 1) return a[0]
    else if (a[0] != a[1]) uniqueInt = a[0]
    else if (a[a.size-1] != a[a.size-2]) {
        uniqueInt = a[a.size-1]
        }
    else{
        for(i in 1 until a.size-1) {
            if(a[i] != a[i-1] && a[i]!= a[i+1]) {
                uniqueInt = a[i]
            }
        }
    }
     */
}

fun main(args: Array<String>) {

    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyInteger(a)

    println(result)
}

/*
Input
5
0 0 1 2 1
Output
2
 */