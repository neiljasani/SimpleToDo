package com.example.simpletodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class EditTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_task)

        val saveButton = findViewById<Button>(R.id.saveButton)
        var editText = findViewById<EditText>(R.id.editItemText)
        var oldText = intent.getStringExtra("text")

        editText.hint = oldText

        saveButton.setOnClickListener(View.OnClickListener {
            val data = Intent(this, MainActivity::class.java)
            data.putExtra("text", editText.text.toString())
            data.putExtra("key", getIntent().getIntExtra("key", 0))
            setResult(RESULT_OK, data)
            finish()
        })
    }
}