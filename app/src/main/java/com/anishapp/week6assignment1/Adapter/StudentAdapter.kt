package com.anishapp.week6assignment1.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anishapp.week6assignment1.Model.Student
import com.anishapp.week6assignment1.R
import com.anishapp.week6assignment1.fragments.Home
import com.bumptech.glide.Glide

class StudentAdapter(
        val lstStudents: ArrayList<Student>,
        val context: Home
):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>(),View.OnClickListener
{
    class StudentViewHolder(view:View):RecyclerView.ViewHolder(view)
    {
        val ProfilePic : ImageView
        val Name : TextView
        val Age : TextView
        val Address : TextView
        val Gender : TextView
        var Delete : ImageButton
        init
        {
            ProfilePic = view.findViewById(R.id.ProfilePic)
            Name = view.findViewById(R.id.Name)
            Age = view.findViewById(R.id.Age)
            Address = view.findViewById(R.id.Address)
            Gender = view.findViewById(R.id.Gender)
            Delete = view.findViewById(R.id.Delete)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder
    {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.mylayout,parent,false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int)
    {
        val student = lstStudents[position]
        holder.Name.text = student.Name
        holder.Age.text = student.Age.toString()
        holder.Address.text = student.Address
        holder.Gender.text = student.Gender

        Glide.with(context)
            .load(student.ProfilePic)
            .into(holder.ProfilePic)
    }

    override fun getItemCount(): Int
    {
        return lstStudents.size
    }

    fun deleteStudent(index:Int)
    {
        val lstStudents = ArrayList<Student>()
        lstStudents.removeAt(index)

    }

    override fun onClick(v: View?) {
        when(v?.id)
        {
            R.id.Delete ->
            {
                deleteStudent(0)
            }
        }
    }
}