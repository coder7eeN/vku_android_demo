package com.example.vku_demo.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author huypham on 2/24/22
 */
@Parcelize
data class Person(
    var firstName: String? = "",
    var lastName: String? = "",
    var phone: Int? = 0
) : Parcelable
