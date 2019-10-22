package com.example.button_internet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val id:Int = 10
    val language:String="kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tomnol untuk megirim ke activity_2.kt
        btn_klik.setOnClickListener(){
            intent= Intent(this,Activitykedua::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("language_value",language)
            startActivity(intent)
        }
    }
}
