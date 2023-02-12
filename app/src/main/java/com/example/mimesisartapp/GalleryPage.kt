package com.example.mimesisartapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_gallery_page.*

class GalleryPage : AppCompatActivity() {

    private lateinit var tablolarArrayList: ArrayList<Tablolar>
    private lateinit var adapter: TablolarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_page)

        rv.setHasFixedSize(true)
        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val t1 = Tablolar(1,"The Weeping Woman","one","Pablo Picasso")

        val t2 = Tablolar(2,"Vase with Pink Roses", "two","Van Gogh")
        val t3 = Tablolar(3,"Lady with an Ermine","three","Leonardo da Vinci")
        val t4 = Tablolar(4,"Woman with a Parasol","four","Claude Monet")
        val t5 = Tablolar(5,"The Kiss","five","Gustav Klimt")
        val t6 = Tablolar(6,"Triumph of Galatea","six","Raphael")
        val t7 = Tablolar(7,"Six Tuscan Poets","seven","Giorgio Vasari")
        val t8 = Tablolar(8, "Blue Nudes","eight","Henri Matisse")
        val t9 = Tablolar(9,"Woman beside the Water", "nine","Henri Matisse")

        tablolarArrayList = ArrayList<Tablolar>()
        tablolarArrayList.add(t1)
        tablolarArrayList.add(t2)
        tablolarArrayList.add(t3)
        tablolarArrayList.add(t4)
        tablolarArrayList.add(t5)
        tablolarArrayList.add(t6)
        tablolarArrayList.add(t7)
        tablolarArrayList.add(t8)
        tablolarArrayList.add(t9)

        adapter =TablolarAdapter(this,tablolarArrayList)
        rv.adapter = adapter
    }
}