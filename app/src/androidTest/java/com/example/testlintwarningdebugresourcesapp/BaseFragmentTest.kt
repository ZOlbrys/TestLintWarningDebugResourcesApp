package com.example.testlintwarningdebugresourcesapp

import androidx.fragment.app.testing.launchFragmentInContainer
import org.junit.Test

class BaseFragmentTest {
    @Test
    fun dummyTest() {
        launchFragmentInContainer<TestBaseFragment>()
    }
}