package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.iterator
import androidx.core.view.size

class MainActivity : AppCompatActivity() {

    private lateinit var shopList: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shopList = findViewById(R.id.shopList)

        for (shopItem in 0..100) {
            val layoutId = R.layout.item
            val view = LayoutInflater.from(this).inflate(layoutId, shopList, false)
            shopList.addView(view)
        }
    }
}