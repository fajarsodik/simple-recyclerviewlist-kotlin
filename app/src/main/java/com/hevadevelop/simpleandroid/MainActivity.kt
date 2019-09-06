package com.hevadevelop.simpleandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.hevadevelop.simpleandroid.adapter.ListSuperheroAdapter
import com.hevadevelop.simpleandroid.model.Superhero
import com.hevadevelop.simpleandroid.model.SuperheroData
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<Superhero> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_heroes.setHasFixedSize(true)
        list.addAll(SuperheroData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item?.itemId?.let { setMode(it) }
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_menu -> {
                startActivity<AboutActivity>()
            }
        }
    }

    private fun showRecyclerList() {
        rv_heroes.layoutManager = LinearLayoutManager(this)
        val listSuperheroAdapter = ListSuperheroAdapter(list)
        rv_heroes.adapter = listSuperheroAdapter
    }
}
