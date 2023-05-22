package com.example.lesson7mvp.presenter

import com.example.lesson7mvp.base.BaseView

class Controller {


  interface View:BaseView.View{

    fun showToast(text:String)


  }


  interface Presenter:BaseView.Presenter<View>



}