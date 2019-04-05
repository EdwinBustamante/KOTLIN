package com.example.dialogfragment

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class DialogoLandscapeForce : DialogFragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, android.R.style.ThemeOverlay_Material_Dialog)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        var view: View = inflater.inflate(R.layout.dialog_fragment_landscape_force, container, false)
        return view
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.MATCH_PARENT
            dialog.window.setLayout(width, height)
        }
        activity!!.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }

    override fun onStop() {
        super.onStop()
        activity!!.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
}
