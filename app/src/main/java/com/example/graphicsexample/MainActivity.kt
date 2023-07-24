package com.example.graphicsexample


import android.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.graphicsexample.databinding.ActivityBarChartBinding
import com.example.graphicsexample.databinding.ActivityMainBinding
import com.example.graphicsexample.databinding.ActivityPieChartBinding
import com.example.graphicsexample.databinding.ActivityRadarChartBinding
import com.example.graphicsexample.ui.BarChartActivity
import com.example.graphicsexample.ui.PieChartActivity
import com.example.graphicsexample.ui.RadarChartActivity


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.barChart.setOnClickListener {
            startActivity(Intent(this, BarChartActivity::class.java))
        }

        binding.pieChart.setOnClickListener {
            startActivity(Intent(this, PieChartActivity::class.java))
        }

        binding.radarChart.setOnClickListener {
            startActivity(Intent(this, RadarChartActivity::class.java))
        }

    }
}