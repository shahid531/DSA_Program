package kotlin_program

import kotlin.math.max
import kotlin.math.min

class RainWaterTrappingKotlin {

    fun waterUnit(arr1: IntArray):Int {
        //height of the building
        //val arr1 = intArrayOf(3, 0, 0, 2, 0, 4)
        //min
        val minArr1 = IntArray(arr1.size)
        minArr1[0] = arr1[0]
        //max
        val maxArr1 = IntArray(arr1.size)
        maxArr1[arr1.size - 1] = arr1[arr1.size - 1]
        //water
        val waterArr1 = IntArray(arr1.size)
        //total water
        var result = 0

        for (i in 1 until arr1.size) {
            minArr1[i] = max(minArr1[i - 1], arr1[i])
        }

        for (i in arr1.size - 2 downTo 0) {
            maxArr1[i] = max(maxArr1[i + 1], arr1[i])
        }

        for (i in arr1.indices) {
            waterArr1[i] = min(minArr1[i], maxArr1[i]) - arr1[i]
        }

        for (i in arr1.indices) {
            result += waterArr1[i]
        }

        println(minArr1.contentToString())
        println(maxArr1.contentToString())
        println(result)
        return result
    }
}