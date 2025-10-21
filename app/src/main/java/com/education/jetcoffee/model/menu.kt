package com.education.jetcoffee.model

import android.view.Menu
import com.education.jetcoffee.R

data class menu(
    val image: Int,
    val title: String,
    val price: String
)

val dummymenu = listOf(
    menu(R.drawable.menu1, "Drop coffee", "20.000"),
    menu(R.drawable.menu2, "Drip coffee", "25.000"),
    menu(R.drawable.menu3, "Drep coffee", "30.000"),
    menu(R.drawable.menu4, "Drap coffee", "35.000"),
)

val dummyBestMenu = dummymenu.shuffled()