package com.project.recyclerviewdisplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private val img = arrayOf(R.drawable.androidsampleayaka,R.drawable.noelle,R.drawable.lumine,R.drawable.zhongli,R.drawable.venti,R.drawable.shogun,R.drawable.beidou)


    private val texts = arrayOf("Ayaka","Noelle","Lumine","ZhongLi","Venti","Raiden Shogun","Beidou")


    private val desc = arrayOf("Frost Flake Heron","All Around DPS","Main Character","No Mora - Archon","Drunk - Archon","Cant Cook!","Hot Mama")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img, texts, desc)
    }
}