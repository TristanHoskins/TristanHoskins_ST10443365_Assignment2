package com.example.imadassignment2_st10443365tristanhoskins

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar



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
            hungerBar.postDelayed({
                if (hungerProgress > 0) {
                    hungerProgress -= 10
                    hungerBar.progress = hungerProgress
                }
            }, 10000)
        }

        clean.setOnClickListener {
            image.setImageResource(R.drawable.clean)
            if (cleanProgress < 30) {
                cleanProgress += 10
                cleanBar.progress = cleanProgress
            }
            cleanBar.postDelayed({
                if (cleanProgress > 0) {
                    cleanProgress -= 10
                    cleanBar.progress = cleanProgress
                }
            }, 10000)
        }
        play.setOnClickListener {
            image.setImageResource(R.drawable.play)
            if (happyProgress < 30) {
                happyProgress += 10
                happyBar.progress = happyProgress
            }
            happyBar.postDelayed({
                if (happyProgress > 0) {
                    happyProgress -= 10
                    happyBar.progress = happyProgress
                }
            }, 10000)
                }


            }
        }

