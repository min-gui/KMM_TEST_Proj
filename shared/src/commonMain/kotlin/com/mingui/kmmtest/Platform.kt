package com.mingui.kmmtest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform