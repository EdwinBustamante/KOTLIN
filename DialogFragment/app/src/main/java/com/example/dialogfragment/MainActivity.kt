package com.example.dialogfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButton()
    }

    private fun setupButton() {
        val btnDialog = findViewById<Button>(R.id.buttonDialogFragment)
        btnDialog.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val dialogo: DialogoFull = DialogoFull()
        var f = supportFragmentManager.beginTransaction()
        dialogo.show(f, "DIALOG")
    }
}
