package com.yalantis.filter.model

import android.graphics.drawable.Drawable
import java.io.Serializable

/**
 * Created by galata on 19.09.16.
 */
interface FilterModel : Serializable {

    fun getText(): String
    fun getIcon(): Int

}