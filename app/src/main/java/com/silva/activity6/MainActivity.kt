@file:Suppress("UNREACHABLE_CODE")

package com.silva.activity6

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlin.Unit as Unit1


class MainActivity : AppCompatActivity() {

    private lateinit var alertDialogBtn: Button
    private lateinit var datePickerDialogBtn: Button
    private lateinit var timePickerDialogBtn: Button
    private lateinit var resultTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        alertDialogBtn = findViewById(R.id.alertDialogBtn)
        datePickerDialogBtn = findViewById(R.id.datePickerDialogBtn)
        timePickerDialogBtn = findViewById(R.id.timePickerDialogBtn)
        resultTextView = findViewById(R.id.resultTextView)

        alertDialogBtn.setOnClickListener { showAlertDialog() }
        datePickerDialogBtn.setOnClickListener { showDatePickerDialog() }
        timePickerDialogBtn.setOnClickListener { showTimePickerDialog() }
    }

    @SuppressLint("SetTextI18n")
    private fun showAlertDialog() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("This is an AlertDialog")
            .setPositiveButton("OK") { _, _ ->
                resultTextView.text = "Dialog Selection: AlertDialog OK"
                Toast.makeText(applicationContext, "OK Clicked", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel") { _, _ ->
                resultTextView.text = "Dialog Selection: AlertDialog Cancel"
                Toast.makeText(applicationContext, "Cancel Clicked", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    @SuppressLint("SetTextI18n")
    private fun showDatePickerDialog() {
        Calendar.getInstance()
        get()
        get()
        get()

        val datePickerDialog = DatePickerDialog()
        datePickerDialog.show()
    }

    private fun DatePickerDialog(): DatePickerDialog {

        return TODO("Provide the return value")
    }

    @SuppressLint("SetTextI18n")
    private fun showTimePickerDialog() {
        Calendar.getInstance()
        get()
        get()

        TimePickerDialog()
        show()
    }

    private fun TimePickerDialog(): Unit1 = Unit1
}

private fun show() {
    TODO("Not yet implemented")
}

private fun get() {

}

class Calendar {
    companion object {
        fun getInstance(): Any {

            return TODO("Provide the return value")
        }

    }
}
