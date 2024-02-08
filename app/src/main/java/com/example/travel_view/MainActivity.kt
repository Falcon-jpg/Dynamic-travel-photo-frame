package com.example.travel_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var current=0
        val a=arrayOf("India Gate","Akshardham","Humayun Tomb","Lotus Temple","Red Fort")
        lateinit var image:ImageView
        val name=findViewById<TextView>(R.id.tvName)
        val next=findViewById<ImageButton>(R.id.btnNext)
        val prev=findViewById<ImageButton>(R.id.btnPrev)


        next.setOnClickListener{
            var currentID="pic$current"
            var currentIntID=this.resources.getIdentifier(currentID,"id",packageName)
            image=findViewById(currentIntID)
            image.alpha= 0f

            current+=1
            if(current==5){
                current=0
            }
            var imagetoshow="pic$current"
            var imageIntID=this.resources.getIdentifier(imagetoshow,"id",packageName)
            image=findViewById(imageIntID)
            image.alpha=1f

            name.text=a[current]


        }
        prev.setOnClickListener{
            var currentID="pic$current"
            var currentIntID=this.resources.getIdentifier(currentID,"id",packageName)
            image=findViewById(currentIntID)
            image.alpha= 0f

            current-=1
            if(current==-1){
                current=4
            }
            var imagetoshow="pic$current"
            var imageIntID=this.resources.getIdentifier(imagetoshow,"id",packageName)
            image=findViewById(imageIntID)
            image.alpha=1f

            name.text=a[current]
            


        }

    }
}