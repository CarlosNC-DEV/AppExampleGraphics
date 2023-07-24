package com.example.graphicsexample.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.graphicsexample.R
import com.example.graphicsexample.databinding.ActivityRadarChartBinding
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.utils.ColorTemplate

class RadarChartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRadarChartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadarChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val radarChart = binding.radarChart

        val radarEntries = ArrayList<RadarEntry>()
        radarEntries.add(RadarEntry(40f))
        radarEntries.add(RadarEntry(60f))
        radarEntries.add(RadarEntry(30f))
        radarEntries.add(RadarEntry(80f))
        radarEntries.add(RadarEntry(50f))

        val dataSet = RadarDataSet(radarEntries, "Ejemplo de Gráfico Radar")
        dataSet.colors = ColorTemplate.COLORFUL_COLORS.asList()
        dataSet.valueTextColor = Color.BLACK
        dataSet.valueTextSize = 12f

        val radarData = RadarData(dataSet)
        radarChart.data = radarData
        radarChart.description.isEnabled = false
        radarChart.webLineWidth = 1f
        radarChart.webColor = Color.GRAY
        radarChart.webLineWidthInner = 1f
        radarChart.webColorInner = Color.GRAY
        radarChart.invalidate()

    }
}