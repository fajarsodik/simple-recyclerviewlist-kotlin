package com.hevadevelop.simpleandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hevadevelop.simpleandroid.DetailHeroActivity
import com.hevadevelop.simpleandroid.R
import com.hevadevelop.simpleandroid.model.Superhero
import kotlinx.android.synthetic.main.item_cardview_hero.view.*
import org.jetbrains.anko.startActivity

class ListSuperheroAdapter(private val listHeroes: ArrayList<Superhero>) :
    RecyclerView.Adapter<ListSuperheroAdapter.ListHeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHeroViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_hero, parent, false)
        return ListHeroViewHolder(view)
    }

    override fun getItemCount(): Int = listHeroes.size

    override fun onBindViewHolder(holder: ListHeroViewHolder, position: Int) {
        val (id, name, photo, creator, simple_description, publisher) = listHeroes[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgHero)

        holder.tvHeroName.text = name
        holder.tvHeroFrom.text = publisher

        holder.itemView.setOnClickListener {
            holder.itemView.context.startActivity<DetailHeroActivity>(
                "id_hero" to id,
                "name_hero" to name,
                "photo_hero" to photo,
                "creator_hero" to creator,
                "simple_description_hero" to simple_description,
                "publisher_hero" to publisher
            )
        }

        holder.itemView.btn_detail.setOnClickListener {
            holder.itemView.context.startActivity<DetailHeroActivity>(
                "id_hero" to id,
                "name_hero" to name,
                "photo_hero" to photo,
                "creator_hero" to creator,
                "simple_description_hero" to simple_description,
                "publisher_hero" to publisher
            )
        }
    }

    inner class ListHeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvHeroName: TextView = itemView.findViewById(R.id.tv_item_name_card)
        var tvHeroFrom: TextView = itemView.findViewById(R.id.tv_item_from_card)
        var imgHero: ImageView = itemView.findViewById(R.id.img_item_photo_card)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }

}