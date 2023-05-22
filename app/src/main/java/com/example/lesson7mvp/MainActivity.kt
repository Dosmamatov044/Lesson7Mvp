package com.example.lesson7mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.lesson7mvp.base.BaseView
import com.example.lesson7mvp.databinding.ActivityMainBinding
import com.example.lesson7mvp.presenter.Controller
import com.example.lesson7mvp.presenter.MainPresenter

class MainActivity : AppCompatActivity(),Controller.View {

    //recyclerview заполнить с помощью mvp
    //прочти про кеширование ретрофита с помощью рума
    lateinit var binding: ActivityMainBinding
    val presenter=MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.attach(this)

        binding.button.setOnClickListener {

          presenter.loadingData()
           presenter.myHideButton()


        }

    }



    override fun showToast(text: String) {

        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()

    }


    override fun hideBtn() {
        binding.button.visibility=View.GONE
    }


}