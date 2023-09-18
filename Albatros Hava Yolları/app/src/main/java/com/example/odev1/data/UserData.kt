package com.example.odev1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserData(
    val ad : String,
    val soyad : String,
    val email : String,
    val sifre : String,)
    : Parcelable





