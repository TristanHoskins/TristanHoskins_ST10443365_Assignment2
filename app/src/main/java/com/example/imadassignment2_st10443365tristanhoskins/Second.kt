package com.example.imadassignment2_st10443365tristanhoskins

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast

class Second : AppCompatActivity() {

    private lateinit var hungerBar: ProgressBar
    private lateinit var cleanBar: ProgressBar
    private lateinit var happyBar: ProgressBar

    private var hungerProgress = 0
    private var cleanProgress = 0
    private var happyProgress = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val feed = findViewById<Button>(R.id.feedB)
        val clean = findViewById<Button>(R.id.cleanB)
        val play = findViewById<Button>(R.id.playB)
        val image = findViewById<ImageView>(R.id.imageView2)

        image.setImageResource(R.drawable.main)

        hungerBar = findViewById(R.id.hungerBar)
        cleanBar = findViewById(R.id.cleanBar)
        happyBar = findViewById(R.id.happyBar)

        feed.setOnClickListener {
            image.setImageResource(R.drawable.eating)
            if (hungerProgress < 30) {
                hungerProgress += 10
                hungerBar.progress = hungerProgress
            }
            if (hungerProgress == 30) {
                feed.isEnabled = false
                if (hungerProgress == 30 && cleanProgress == 30 && happyProgress == 30) {
                    // Reset progress bars
                    hungerProgress = 0
                    cleanProgress = 0
                    happyProgress = 0
                    hungerBar.progress = 0
                    cleanBar.progress = 0
                    happyBar.progress = 0

                    // Enable buttons
                    feed.isEnabled = true
                    clean.isEnabled = true
                    play.isEnabled = true

                    image.setImageResource(R.drawable.main)
                Toast.makeText(this, "Luna is full!", Toast.LENGTH_SHORT).show()
            }
        }

        clean.setOnClickListener {
            image.setImageResource(R.drawable.clean)
            if (cleanProgress < 30) {
                cleanProgress += 10
                cleanBar.progress = cleanProgress
            }
            if (cleanProgress == 30) {
                clean.isEnabled = false
                if (hungerProgress == 30 && cleanProgress == 30 && happyProgress == 30) {
                    // Reset progress bars
                    hungerProgress = 0
                    cleanProgress = 0
                    happyProgress = 0
                    hungerBar.progress = 0
                    cleanBar.progress = 0
                    happyBar.progress = 0

                    // Enable buttons
                    feed.isEnabled = true
                    clean.isEnabled = true
                    play.isEnabled = true

                    image.setImageResource(R.drawable.main)
                Toast.makeText(this, "Luna is clean!", Toast.LENGTH_SHORT).show()


            }
        }
        play.setOnClickListener {
            image.setImageResource(R.drawable.play)
            if (happyProgress < 30) {
                happyProgress += 10
                happyBar.progress = happyProgress
            }
            if (happyProgress == 30) {
                play.isEnabled = false
                if (hungerProgress == 30 && cleanProgress == 30 && happyProgress == 30) {
                    // Reset progress bars
                    hungerProgress = 0
                    cleanProgress = 0
                    happyProgress = 0
                    hungerBar.progress = 0
                    cleanBar.progress = 0
                    happyBar.progress = 0

                    // Enable buttons
                    feed.isEnabled = true
                    clean.isEnabled = true
                    play.isEnabled = true

                    image.setImageResource(R.drawable.main)
                    Toast.makeText(this, "Luna is happy!", Toast.LENGTH_SHORT).show()


                }
            }
        } } } } }