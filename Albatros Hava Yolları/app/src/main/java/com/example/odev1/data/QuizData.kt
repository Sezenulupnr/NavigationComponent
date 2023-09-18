package com.example.odev1.data

import android.icu.number.IntegerWidth
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class QuizData(
    var telefon : String,
    var nereden : String,
    var nereye : String,
    var tarih : String
)
    : Parcelable