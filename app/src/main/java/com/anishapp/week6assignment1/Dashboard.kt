package com.anishapp.week6assignment1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anishapp.week6assignment1.Adapter.StudentAdapter
import com.anishapp.week6assignment1.Model.Student
import com.anishapp.week6assignment1.fragments.AboutUs
import com.anishapp.week6assignment1.fragments.AddStudent
import com.anishapp.week6assignment1.fragments.Home

class Dashboard : AppCompatActivity() {
    private lateinit var Home : ImageButton
    private lateinit var AddStudent : ImageButton
    private lateinit var AboutUs : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        Home = findViewById(R.id.Home)
        AddStudent = findViewById(R.id.AddStudent)
        AboutUs = findViewById(R.id.AboutUs)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.LinearContainer, Home())
            addToBackStack(null)
            commit()
        }

        Home.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, Home())
                addToBackStack(null)
                commit()
            }
        }

        AddStudent.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, AddStudent())
                addToBackStack(null)
                commit()
            }
        }

        AboutUs.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, AboutUs())
                addToBackStack(null)
                commit()
            }
        }
    }
}