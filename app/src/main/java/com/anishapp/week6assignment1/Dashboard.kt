package com.anishapp.week6assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.ImageButton
import com.anishapp.week6assignment1.Model.Student
import com.anishapp.week6assignment1.fragments.AboutUs
import com.anishapp.week6assignment1.fragments.AddStudent
import com.anishapp.week6assignment1.fragments.Home
import java.util.ArrayList

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

        loadStudent()

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

    private fun loadStudent()
    {
        StudentDetails.addStudent(Student("https://scontent.fktm3-1.fna.fbcdn.net/v/t1.0-9/89760860_516903139249311_5570614862570061824_n.jpg?_nc_cat=105&ccb=2&_nc_sid=09cbfe&_nc_ohc=iz9ybplRykgAX8wUoO6&_nc_ht=scontent.fktm3-1.fna&oh=bca0a4b139e6fc17e6d4b74b1b1ed5d8&oe=6028A1BD","Anish Nepal",20,"Male","Taudaha"))
        StudentDetails.addStudent(Student("https://scontent.fktm3-1.fna.fbcdn.net/v/t1.0-9/62525847_2880109138675328_160048069340037120_o.jpg?_nc_cat=1&ccb=2&_nc_sid=09cbfe&_nc_ohc=ZsgojJrGtZgAX_paEb-&_nc_ht=scontent.fktm3-1.fna&oh=5d7a75ed9506375256a8dec2f75e800c&oe=6028D492","Lionel Messi",33,"Male","Spain"))
        StudentDetails.addStudent(Student("https://scontent.fktm3-1.fna.fbcdn.net/v/t1.0-9/137204903_103965654999585_3903404643377330310_n.jpg?_nc_cat=101&ccb=2&_nc_sid=09cbfe&_nc_ohc=vdA0ctyRVhUAX86F7Nm&_nc_ht=scontent.fktm3-1.fna&oh=12c32ee8150a0de5d7a84d21ffa0aa66&oe=6028304B","Nidhi Agarwal",27,"Female","Hyderabad"))
    }
}