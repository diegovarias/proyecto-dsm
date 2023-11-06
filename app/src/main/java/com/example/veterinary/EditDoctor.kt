package com.example.veterinary

import android.app.Activity
import android.os.Bundle
import android.widget.EditText

class EditDoctor : Activity() {
    private lateinit var editTextName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var editTextDUI: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_doctor)

        editTextName = findViewById(R.id.editTextName)
        editTextLastName = findViewById(R.id.editTextLastName)
        editTextDUI = findViewById(R.id.editTextDUI)
    }
}
