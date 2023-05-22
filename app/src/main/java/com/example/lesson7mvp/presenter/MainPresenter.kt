package com.example.lesson7mvp.presenter

class MainPresenter:Controller.Presenter {
val isFinish:Boolean=false
    lateinit var view: Controller.View


     fun myHideButton(){

       view.hideBtn()
     }


    fun loadingData(){

        if (isFinish){

            view.showToast("Завершен")
        }else{

            view.showToast("Не завершен")
        }
    }





    override fun attach(view: Controller.View) {
        this.view=view
    }

    override fun stop(){}
}