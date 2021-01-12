package com.anishapp.week6assignment1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
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
            checkNull()
        }

        return view
    }

    private fun checkNull()
    {
        if(Fullname.text.toString() == "")
        {
            Fullname.error = "Please enter your full name"
            Fullname.requestFocus()
        }
        else if(Age.text.toString() == "")
        {
            Age.error = "Please enter your age"
            Age.requestFocus()
        }
        else if(Address.text.toString() == "")
        {
            Address.error = "Please enter your address"
            Address.requestFocus()
        }
        else if(gender == "")
        {
            Toast.makeText(context,"Select your gender",Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(context,"Details Saved.",Toast.LENGTH_SHORT).show()
        }
    }

}