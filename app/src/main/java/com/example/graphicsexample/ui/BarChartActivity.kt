package com.example.graphicsexample.ui

import android.R
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.graphicsexample.databinding.ActivityBarChartBinding
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate


class BarChartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBarChartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val barChart = binding.barChart

        val barEntries = ArrayList<BarEntry>()
        barEntries.add(BarEntry(1f, 40f))
        barEntries.add(BarEntry(2f, 60f))
        barEntries.add(BarEntry(3f, 30f))
        barEntries.add(BarEntry(4f, 80f))

        val dataSet = BarDataSet(barEntries, "Ejemplo de Gráfico de Barras")
        dataSet.setColors(*ColorTemplate.COLORFUL_COLORS)
        dataSet.valueTextColor = Color.BLACK
        dataSet.valueTextSize = 12f

        val barData = BarData(dataSet)
        barData.barWidth = 0.9f

        barChart.data = barData
        barChart.description.isEnabled = false
        barChart.setFitBars(true)
        barChart.invalidate()


    }
}