package ru.myitschool.lab23

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.myitschool.lab23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun getRandomValues() {
        val sizeText = binding.content.sizeParam.text.toString()
        val shapeText = binding.content.shapeParam.text.toString()
        val rateText = binding.content.rateParam.text.toString()

        val n = if(sizeText=="") 0 else sizeText.toInt()
        val k = if(shapeText=="") 0 else shapeText.toInt()
        val r = if(rateText=="") 0.0 else rateText.toDouble()

        val calcArray = DoubleArray(n)
        repeat(n) {
            // вычисления
            // calcArray[it] = ...
        }
        /*
        Вызов второй активности через явный Intent
         */


    }
}