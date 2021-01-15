package com.anishapp.week6assignment1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anishapp.week6assignment1.Adapter.StudentAdapter
import com.anishapp.week6assignment1.Model.Student
import com.anishapp.week6assignment1.R
import com.anishapp.week6assignment1.StudentDetails

class Home : Fragment() {
    private lateinit var recyclerview : RecyclerView
    private var lstStudents = ArrayList<Student>()

    private lateinit var pp:String
    private lateinit var name:String
    private lateinit var age:String
    private lateinit var gender:String
    private lateinit var address:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerview = view.findViewById(R.id.recyclerview)
        val adapter = StudentAdapter(StudentDetails.showStudent(),context!!)
        recyclerview.layoutManager = LinearLayoutManager(context)
        recyclerview.adapter = adapter
        return view
    }
}


