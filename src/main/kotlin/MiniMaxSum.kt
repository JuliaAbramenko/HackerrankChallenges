/**
 * Returns the minimum Sum and maxium Sum of a given array in one line
 */
fun miniMaxSum(arr: Array<Int>) {
    arr.sort()
    val minSum = arr.get(0).toLong() +  arr.get(1).toLong() + arr.get(2).toLong() + arr.get(3).toLong()
    val maxSum = arr.get(1).toLong() +  arr.get(2).toLong() + arr.get(3).toLong() + arr.get(4).toLong()
    println(minSum.toString() + " " + maxSum.toString())

}

fun main(args: Array<String>) {
    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    miniMaxSum(arr)
}

/*
Sample Input
1 2 3 4 5

Sample Output
10 14
 */