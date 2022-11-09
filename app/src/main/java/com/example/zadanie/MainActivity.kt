package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgbutton = 1

        while(true){
            if(imgbutton==1){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tree)
            }
            else if(imgbutton==2){
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zlator)
            }
            else{
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cat03)
            }



            findViewById<Button>(R.id.prev).setOnClickListener {
                if(imgbutton>1) {
                    imgbutton -= 1
                }
                else imgbutton=3
                }


            findViewById<Button>(R.id.next).setOnClickListener {
                if(imgbutton<3){imgbutton+=1}
                else imgbutton=1
            }}
        }
    }