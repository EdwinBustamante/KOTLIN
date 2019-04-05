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
        val btnDialogLandscape = findViewById<Button>(R.id.buttonLandscape)
        btnDialogLandscape.setOnClickListener {
            showDialogL()
        }
        val btnDialogLandscapeForce = findViewById<Button>(R.id.buttonLanscapeForce)
        btnDialogLandscapeForce.setOnClickListener {
            showDialogLF()
        }
    }

    private fun showDialogLF() {
        val dialogo: DialogoLandscapeForce = DialogoLandscapeForce()
        var f = supportFragmentManager.beginTransaction()
        dialogo.show(f, "DIALOGLANDSCAPEFORCE")
    }

    private fun showDialogL() {
        val dialogo: DialogoLandscape = DialogoLandscape()
        var f = supportFragmentManager.beginTransaction()
        dialogo.show(f, "DIALOGLANDSCAPE")
    }

    private fun showDialog() {
        val dialogo: DialogoFull = DialogoFull()
        var f = supportFragmentManager.beginTransaction()
        dialogo.show(f, "DIALOG")
    }
}
