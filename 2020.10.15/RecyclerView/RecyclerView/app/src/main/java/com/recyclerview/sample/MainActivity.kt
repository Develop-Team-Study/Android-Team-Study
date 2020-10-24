package com.recyclerview.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.recyclerview.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val boxAdapter = SampleAdapter()

        //레이아웃 매니저 지정
        binding.recyclerView.adapter = boxAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        boxAdapter.add(1)
        boxAdapter.add(2)
        boxAdapter.add(1)
        boxAdapter.add(1)
        boxAdapter.add(2)
        boxAdapter.add(1)
        boxAdapter.add(2)
        boxAdapter.add(1)
        boxAdapter.add(1)
        boxAdapter.add(2)
        boxAdapter.add(1)
        boxAdapter.add(2)
        boxAdapter.add(1)
        boxAdapter.add(1)
        boxAdapter.add(2)
    }
}