package com.example.graphicsexample.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.graphicsexample.R
import com.example.graphicsexample.databinding.ActivityPieChartBinding
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class PieChartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPieChartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPieChartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val pieChart = binding.pieChart

        val pieEntries = ArrayList<PieEntry>()
        pieEntries.add(PieEntry(100f, "Categoría 1"))
        pieEntries.add(PieEntry(100f, "Categoría 2"))
        pieEntries.add(PieEntry(100f, "Categoría 3"))
        pieEntries.add(PieEntry(100f, "Categoría 4"))
        pieEntries.add(PieEntry(100f, "Categoría 5"))

        val dataSet = PieDataSet(pieEntries, "Ejemplo de Gráfico de Pastel")
        dataSet.setColors(*ColorTemplate.COLORFUL_COLORS)
        dataSet.valueTextColor = Color.WHITE
        dataSet.valueTextSize = 20f

        val pieData = PieData(dataSet)

        pieChart.data = pieData
        pieChart.description.isEnabled = false
        pieChart.setDrawEntryLabels(false)
        pieChart.setUsePercentValues(true)
        pieChart.invalidate()


    }
}