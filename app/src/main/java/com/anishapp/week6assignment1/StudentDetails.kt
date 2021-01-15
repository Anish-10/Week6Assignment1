package com.anishapp.week6assignment1

import com.anishapp.week6assignment1.Model.Student

object StudentDetails
{
    var lstStudents = ArrayList<Student>()

    fun addStudent(student: Student)
    {
        lstStudents.add(student)
    }

    fun showStudent():ArrayList<Student>
    {
        return lstStudents
    }
}