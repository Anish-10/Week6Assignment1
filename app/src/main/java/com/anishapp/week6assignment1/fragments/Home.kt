package com.anishapp.week6assignment1.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anishapp.week6assignment1.Adapter.StudentAdapter
import com.anishapp.week6assignment1.Model.Student
import com.anishapp.week6assignment1.R

class Home : Fragment() {
    private lateinit var recyclerview : RecyclerView
    private var lstStudents = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerview = view.findViewById(R.id.recyclerview)
        val adapter = StudentAdapter(lstStudents,this)
        recyclerview.layoutManager = LinearLayoutManager(view.context)
        recyclerview.adapter = adapter
        return view
    }
}