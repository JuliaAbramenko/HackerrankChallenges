import kotlin.math.abs

/**
 * Given a square matrix, calculates the absolute difference between the sums of its diagonals.
 */
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var rightDiagonal = 0
    var leftDiagonal = 0
    for (x in arr.indices) {
        rightDiagonal += arr[x][arr.size-1-x]
        leftDiagonal += arr[x][x]
    }
    return abs(leftDiagonal - rightDiagonal)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}

/*
Sample Input
3
11 2 4
4 5 6
10 8 -12

Sample Output
15
 */