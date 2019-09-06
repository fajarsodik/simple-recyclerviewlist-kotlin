package com.hevadevelop.simpleandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_hero.*
import org.jetbrains.anko.toast

class DetailHeroActivity : AppCompatActivity() {

    private lateinit var id_hero: String
    private lateinit var name_hero: String
    private lateinit var photo_hero: String
    private lateinit var creator_hero: String
    private lateinit var simple_description_hero: String
    private lateinit var publisher_hero: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        id_hero = intent.getStringExtra("id_hero")
        name_hero = intent.getStringExtra("name_hero")
        photo_hero = intent.getStringExtra("photo_hero")
        creator_hero = intent.getStringExtra("creator_hero")
        simple_description_hero = intent.getStringExtra("simple_description_hero")
        publisher_hero = intent.getStringExtra("publisher_hero")

        supportActionBar?.title = name_hero

        Glide.with(this)
            .load(photo_hero)
            .into(img_hero)

        tv_hero_name.text = name_hero
        tv_hero_simple_description.text = simple_description_hero
        tv_hero_creator.text = creator_hero
        tv_hero_publisher.text = publisher_hero
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
