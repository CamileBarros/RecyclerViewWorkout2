package com.camile.recyclerviewworkout2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
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

        val bundle = photo

        supportFragmentManager.commit{
            setReorderingAllowed(true)
            add<SevenWondersDetails>(R.id.fragment_details)
        }
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.sevenWondersAdapter.setDataSet(dataSource)
    }
}