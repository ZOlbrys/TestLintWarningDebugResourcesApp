package com.example.testlintwarningdebugresourcesapp

import androidx.test.core.app.ActivityScenario
import org.junit.Test

class BaseActivityTest {
    @Test
    fun dummyTest() {
        ActivityScenario.launch(TestBaseActivity::class.java)
    }
}
