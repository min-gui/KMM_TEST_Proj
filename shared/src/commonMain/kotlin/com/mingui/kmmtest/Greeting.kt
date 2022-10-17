package com.mingui.kmmtest

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "안녕하세요 Hello, ${platform.name}!"
    }
}