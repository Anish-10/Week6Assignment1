package com.anishapp.week6assignment1.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.anishapp.week6assignment1.Model.Student
import com.anishapp.week6assignment1.R

class AddStudent : Fragment() {
    private lateinit var Fullname : EditText
    private lateinit var Age : EditText
    private lateinit var Address : EditText
    private lateinit var Male : RadioButton
    private lateinit var Female : RadioButton
    private lateinit var Others : RadioButton
    private lateinit var Save : Button

    private var gender = ""
    private val lstStudents = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)
        Fullname = view.findViewById(R.id.Fullname)
        Age = view.findViewById(R.id.Age)
        Address = view.findViewById(R.id.Address)
        Male = view.findViewById(R.id.Male)
        Female = view.findViewById(R.id.Female)
        Others = view.findViewById(R.id.Others)
        Save = view.findViewById(R.id.Save)

        Male.setOnClickListener {
            gender = Male.text.toString()
        }

        Female.setOnClickListener {
            gender = Female.text.toString()
        }

        Others.setOnClickListener {
            gender = Others.text.toString()
        }

        Save.setOnClickListener {
            if(checkNull())
            {
                saveDetails()
            }
        }

        return view
    }

    private fun checkNull(): Boolean {
        var check = true
        if(Fullname.text.toString() == "")
        {
            Fullname.error = "Please enter your full name"
            Fullname.requestFocus()
            check = false
        }
        else if(Age.text.toString() == "")
        {
            Age.error = "Please enter your age"
            Age.requestFocus()
            check = false
        }
        else if(Address.text.toString() == "")
        {
            Address.error = "Please enter your address"
            Address.requestFocus()
            check = false
        }
        else if(gender == "")
        {
            Toast.makeText(context,"Select your gender",Toast.LENGTH_LONG).show()
            check = false
        }
        else
        {
            Toast.makeText(context,"Details Saved.",Toast.LENGTH_SHORT).show()
        }
        return check
    }

    private fun saveDetails()
    {
        val fullname = Fullname.text.toString()
        val age = Age.text.toString().toInt()
        val address = Address.text.toString()
        val gen = gender
        if(gen == "Male")
        {
            val image = R.drawable.male.toString()
            lstStudents.add(Student(image,fullname,age,gen,address))
        }
        else if(gen == "Female")
        {
            val image = R.drawable.female.toString()
            lstStudents.add(Student(image,fullname,age,gen,address))
        }
        else
        {
            val image = R.drawable.others.toString()
            lstStudents.add(Student(image,fullname,age,gen,address))
        }

    }

}

