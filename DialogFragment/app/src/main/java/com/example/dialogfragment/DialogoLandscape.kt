package com.example.dialogfragment


import android.os.Bundle
import android.os.Handler
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout


class DialogoLandscape : DialogFragment() {


    lateinit var vie: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NORMAL, android.R.style.ThemeOverlay_Material_Dialog)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        vie = inflater.inflate(R.layout.dialog_fragment_landscape, container, false)
        val btnRotate = vie.findViewById<Button>(R.id.rotate)
        btnRotate.setOnClickListener {
            val mainLayout = vie.findViewById(R.id.main) as RelativeLayout
            val w = mainLayout.width
            val h = mainLayout.height

            mainLayout.rotation = 270.0f
            mainLayout.translationX = ((w - h) / 2).toFloat()
            mainLayout.translationY = ((h - w) / 2).toFloat()

            val lp = mainLayout.layoutParams as ViewGroup.LayoutParams
            lp.height = w
            lp.width = h
            mainLayout.requestLayout()
        }
        return vie
    }

    override fun onResume() {
        super.onResume()
        val handler = Handler()
        handler.postDelayed(Runnable {
            val mainLayout = vie.findViewById(R.id.main) as RelativeLayout
            val w = mainLayout.width
            val h = mainLayout.height

            mainLayout.rotation = 270.0f
            mainLayout.translationX = ((w - h) / 2).toFloat()
            mainLayout.translationY = ((h - w) / 2).toFloat()

            val lp = mainLayout.layoutParams as ViewGroup.LayoutParams
            lp.height = w
            lp.width = h
            mainLayout.requestLayout()

        }, 5000)//5 segundos
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.MATCH_PARENT
            //Toast.makeText(activity,"$width $height",Toast.LENGTH_SHORT).show()
            dialog.window.setLayout(width, height)


        }
    }

}
