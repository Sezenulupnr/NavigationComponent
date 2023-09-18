package com.example.odev1.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AllData(
    val user : UserData,
    val quiz : QuizData
)
    : Parcelable