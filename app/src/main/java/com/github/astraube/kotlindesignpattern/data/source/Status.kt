package com.github.astraube.kotlindesignpattern.data.source

enum class Status(val id: Int) {
    DEFAULT(0),
    SUCCESS(1),
    ERROR(2),
    LOADING(3),
    EMPTY(4)
}