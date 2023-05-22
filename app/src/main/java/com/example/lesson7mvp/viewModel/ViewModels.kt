package com.example.lesson7mvp.viewModel

import androidx.lifecycle.ViewModel

class ViewModels(val repository: Repository): ViewModel() {




    suspend fun data(){

        repository.createList()

    }




}