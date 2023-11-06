package com.example.veterinary

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditAppointment : Activity() {
    private lateinit var editTextDate: EditText
    private lateinit var editTextTime: EditText
    private lateinit var editTextPatient: EditText
    private lateinit var editTextDoctor: EditText
    private lateinit var editTextNotes: EditText
    private lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_appointment)

        editTextDate = findViewById(R.id.editTextDate)
        editTextTime = findViewById(R.id.editTextTime)
        editTextPatient = findViewById(R.id.editTextPatient)
        editTextDoctor = findViewById(R.id.editTextDoctor)
        editTextNotes = findViewById(R.id.editTextNotes)
        buttonSave = findViewById(R.id.buttonSave)
    }
}
