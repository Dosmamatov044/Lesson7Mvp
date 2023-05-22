package com.example.lesson7mvp.viewModel

class RepositoryImpl: Repository {



    override suspend fun createList(): List<String> {


        return listOf("maks","dasha")
    }


}