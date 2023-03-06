package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    // TODO - Test with greater numbers and test edge cases
    @Test
    fun checkCalculation() {
        val result1: Int = underTest.fibonacci(10)
        val result3: Int = underTest.fibonacci(9)

        Assertions.assertEquals(55, result1)
        Assertions.assertEquals(34, result3)
    }
}