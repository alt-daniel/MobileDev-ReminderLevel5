package com.example.reminderapp.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.reminderapp.R
import com.example.reminderapp.model.Reminder

import kotlinx.android.synthetic.main.activity_add.*
import kotlinx.android.synthetic.main.content_add.*

const val EXTRA_REMINDER = "EXTRA_REMINDER"
const val EMPTY_REMINDER = "The reminder can't be empty"

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        setSupportActionBar(toolbar)

        initView()
    }

    private fun initView() {
        fab.setOnClickListener{ onSaveClick() }
    }

    private fun onSaveClick() {
        if (etReminder.text.toString().isNotBlank()) {
            val reminder = Reminder(etReminder.text.toString())
            val resultIntent = Intent()
            resultIntent.putExtra(EXTRA_REMINDER, reminder)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        } else {
            Toast.makeText(this, EMPTY_REMINDER, Toast.LENGTH_SHORT).show()
        }

    }
}
