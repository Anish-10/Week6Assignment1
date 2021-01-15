package com.anishapp.week6assignment1.Model

import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView
import java.io.Serializable

data class Student(
    val ProfilePic:String?=null,
    val Name:String?=null,
    val Age:Int?=null,
    val Gender:String?=null,
    val Address:String?=null
):Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(ProfilePic)
        parcel.writeString(Name)
        parcel.writeValue(Age)
        parcel.writeString(Gender)
        parcel.writeString(Address)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }
}