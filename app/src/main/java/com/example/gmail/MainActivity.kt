package com.example.gmail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.adapters.EmailAdapter
import com.example.gmail.models.Email

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data for the email list
        val emailList = listOf(
            Email("E", "Edurila.com", "$19 Only (First 10 spots) - Bestselling...","Are you looking to learn Web Designing?", "12:34 PM"),
            Email("C", "Chris Abad", "Help make Campaign Monitor better","Help make Campaign Monitor better", "11:22 AM"),
            Email("T", "Tuto.com", "8h de formation gratuite et les nouvea...","Free courses on Photoshop, SEO...", "11:04 AM"),
            Email("S", "Support", "Societe Ovh : suivi de vos services - hp...","Your service report is ready", "10:26 AM"),
            Email("M", "Matt from Ionic", "The new Ionic Creator is here!", "Announcing the all_new Creator, build...","10:00 AM"),
            Email("T", "Tuto.com", "8h de formation gratuite et les nouvea...","Free courses on Photoshop, SEO...", "11:04 AM"),
            Email("S", "Support", "Societe Ovh : suivi de vos services - hp...","Your service report is ready", "10:26 AM"),
            Email("M", "Matt from Ionic", "The new Ionic Creator is here!", "Announcing the all_new Creator, build...","10:00 AM")
        )

        val recyclerView: RecyclerView = findViewById(R.id.main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}