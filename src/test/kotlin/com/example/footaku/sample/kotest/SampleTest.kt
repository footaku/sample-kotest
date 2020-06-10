package com.example.footaku.sample.kotest

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.booleans.shouldBeTrue

class SampleTest : WordSpec() {

//    override fun isolationMode() = IsolationMode.InstancePerLeaf
//    override fun isolationMode() = IsolationMode.InstancePerTest

    init {
        listener(SampleTestListener())

        "Samples" should {
            prepareSpec {
                println("${SampleTest::class}#PrepareSpec")
            }

            finalizeSpec {
                println("${SampleTest::class}#FinalizeSpec")
            }

            beforeTest {
                println("${SampleTest::class}#BeforeTest")
            }

            afterTest {
                println("${SampleTest::class}#AfterTest")
            }

            beforeSpec {
                println("${SampleTest::class}#BeforeSpec")
            }

            afterSpec {
                println("${SampleTest::class}#AfterSpec")
            }

            "alive" {
                println("This is first test")
                true.shouldBeTrue()
            }
        }

        "Non-Listeners" should {
            "alive" {
                println("This is second test")
                true.shouldBeTrue()
            }
        }
    }
}
