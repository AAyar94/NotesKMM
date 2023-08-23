package com.aayar94.noteskmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform