package com.camile.recyclerviewworkout2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var sevenWondersAdapter: SevenWondersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.sevenWondersAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {
        this.sevenWondersAdapter = SevenWondersAdapter{
            openDetails(it.photo, it.description)
         }

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = sevenWondersAdapter
        }

    }

    private fun openDetails(photo: String, description: String) {

    }
}