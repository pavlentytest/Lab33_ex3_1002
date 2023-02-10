package ru.myitschool.lab23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder

data class Person(val name: String)
class ResultActivity : AppCompatActivity() {

    private lateinit var persons: List<Person>
    private lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resString = application.assets.open("test.json").bufferedReader().use { it.readText() }
        val gson = GsonBuilder().create()
        persons = gson.fromJson(resString, Array<Person>::class.java).toList()
        rv = findViewById(R.id.generated_list)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyAdapter(persons)

    }
}