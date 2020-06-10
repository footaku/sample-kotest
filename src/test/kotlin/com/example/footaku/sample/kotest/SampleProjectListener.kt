package com.example.footaku.sample.kotest

import io.kotest.core.listeners.ProjectListener
import io.kotest.core.spec.AutoScan

@AutoScan
class SampleProjectListener : ProjectListener {
    override fun beforeProject() {
        println("${SampleProjectListener::class}#BeforeProject")
    }

    override fun afterProject() {
        println("${SampleProjectListener::class}#AfterProject")
    }
}
