package com.example.lesson7mvp.base

class BaseView {

  interface  View{
      fun hideBtn()
  }




    interface Presenter<in T>{

      fun attach (view:T)

       fun stop()

    }

}