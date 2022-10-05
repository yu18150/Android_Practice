package com.yuchen.roll2dices

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice = Dice(7)


            assertTrue("The dice value was not between 1 and 6", dice.roll() in 1..6)

        // val rollResult = dice.roll()


    }
}