package com.anishapp.week6assignment1.Model

import java.io.Serializable

data class Student(
    val ProfilePic:String?=null,
    val Name:String?=null,
    val Age:Int?=null,
    val Gender:String?=null,
    val Address:String?=null
):Serializable