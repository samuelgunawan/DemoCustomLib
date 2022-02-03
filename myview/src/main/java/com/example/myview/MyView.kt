package com.example.myview

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView

class MyView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        val textView = TextView(context).apply {
            text = "Ini my view"
        }
        addView(textView)
    }
}