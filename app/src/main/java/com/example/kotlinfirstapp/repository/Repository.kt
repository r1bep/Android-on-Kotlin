package com.example.kotlinfirstapp.repository

import com.example.kotlinfirstapp.data.Persons

class Repository : IRepository {
    private val persons: List<Persons> = listOf(
        Persons("Николай", 32),
        Persons("Дарья", 31)
    )

    override fun getPersons(): List<Persons> {
        return persons
    }
}

interface IRepository {
    fun getPersons(): List<Persons>
}
