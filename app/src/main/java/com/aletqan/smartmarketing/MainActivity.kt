package com.aletqan.smartmarketing

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.WHITE)
        }

        val title = TextView(this).apply {
            text = "مصنع الإتقان للأبواب السحابة"
            textSize = 25f
            setTextColor(Color.rgb(20, 120, 65))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "الإتقان للتسويق الذكي\n\nنظام إدارة المصنع"
            textSize = 20f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
            setPadding(0, 30, 0, 30)
        }

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
