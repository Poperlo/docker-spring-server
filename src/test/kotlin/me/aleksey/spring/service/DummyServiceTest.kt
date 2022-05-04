package me.aleksey.spring.service

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class DummyServiceTest {

    private val dummyService = DummyService()

    @Test
    fun simpleFun() {
        Assertions.assertThat(dummyService.simpleFun())
            .isEqualTo(2)
    }
}