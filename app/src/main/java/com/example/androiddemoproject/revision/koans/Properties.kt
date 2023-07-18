package com.example.androiddemoproject.revision.koans

/*
Add a custom setter to PropertyExample.propertyWithCounter so that the counter property is
incremented every time the propertyWithCounter is assigned.
 */

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(value) {
            ++counter
            field = value
        }
}