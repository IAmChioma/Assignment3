package com.example.assignment3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun click(view : View){
        if(name.text.trim().isNotEmpty() && version.text.trim().isNotEmpty()) {
            add.setOnClickListener {
                val tableRow = TableRow(getApplicationContext())
                val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
//                layoutParams.setMargins(20, 20, 20, 20)

                tableRow.setLayoutParams(layoutParams)
                tableRow.setPadding(5, 5, 5, 5)

                tableRow.setBackgroundColor(getResources().getColor(R.color.pink))

                val newName = TextView(getApplicationContext())
                newName.setText(name.getText().toString())
                newName.setTextColor(getResources().getColor(R.color.black))

                val newVersion = TextView(getApplicationContext())
                newVersion.setText(version.getText().toString())
                newVersion.setTextColor(getResources().getColor(R.color.black))

                tableRow.addView(newVersion, 0)
                tableRow.addView(newName, 1)
                tableLayoutid.addView(tableRow)
                name.getText().clear()
                version.getText().clear()
            }
        }
    }
}