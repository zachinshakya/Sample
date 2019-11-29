package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

        lateinit var date:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dates=findViewById<TextView>(R.id.date)
        getdates()
       date=findViewById(R.id.date)
        val binding:ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        var users = User("sachin",0,"")
        users.name="nabin"

        binding.setVariable(BR.users, users)
        binding.executePendingBindings()
        binding.setVariable(BR.users, users)
    }
    fun getdates()
    {
        var date: String ="hey"
     //   date.text="jej"

    }

}



