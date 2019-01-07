package com.example.joni.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = (Math.random()*3)

        Log.d("TestApp", "$number")

        btnClick.setOnClickListener {

            val snack = Snackbar.make(relativeLayout, "This is a snackbar", Snackbar.LENGTH_SHORT)
            snack.setAction("UNDO") {

                txtHeadline.text = if (txtHeadline.text == getString(R.string.bye))
                                        getString(R.string.hello)
                                    else  getString(R.string.bye)

            }
            snack.show()

            if (txtHeadline.text == getString(R.string.hello)) {
                txtHeadline.text = getString(R.string.bye)
            }
            else {
                txtHeadline.text = getString(R.string.hello)
            }
        }


        btnIncrement.setOnClickListener{
            txtView.text = (txtView.text.toString().toInt() + 1).toString()
            Toast.makeText(this, "+1", Toast.LENGTH_SHORT).show()
        }
    }

}
