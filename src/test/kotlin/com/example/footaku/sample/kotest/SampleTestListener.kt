package com.example.footaku.sample.kotest

import io.kotest.core.listeners.TestListener
import io.kotest.core.spec.Spec
import io.kotest.core.test.TestCase
import io.kotest.core.test.TestResult

class SampleTestListener: TestListener {
    override suspend fun beforeInvocation(testCase: TestCase, iteration: Int) {
        println("${SampleTestListener::class}#BeforeInvocation")
    }

    override suspend fun afterInvocation(testCase: TestCase, iteration: Int) {
        println("${SampleTestListener::class}#AfterInvocation")
    }

    override suspend fun beforeSpec(spec: Spec) {
        println("${SampleTestListener::class}#BeforeSpec")
    }

    override suspend fun afterSpec(spec: Spec) {
        println("${SampleTestListener::class}#AfterSpec")
    }

    override suspend fun beforeTest(testCase: TestCase) {
        println("${SampleTestListener::class}#BeforeTest")
    }

    override suspend fun afterTest(testCase: TestCase, result: TestResult) {
        println("${SampleTestListener::class}#AfterTest")
    }
}
