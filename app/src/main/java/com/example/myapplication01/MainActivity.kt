package com.example.myapplication01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miss = Toast.makeText(applicationContext,"Some field is blank.", Toast.LENGTH_LONG)
        val clear = Toast.makeText(applicationContext,"All fields are cleared.",Toast.LENGTH_LONG)
        var cred:Double
        var grade:Double
        var gpa:Double

        ok1.setOnClickListener(){
            if (this.sub1.text.toString() == "" || this.sub2.text.toString() == "" || this.sub3.text.toString() == "" || this.sub4.text.toString() == ""
                || this.sub5.text.toString() == "" || this.cre1.text.toString() == "" || this.cre2.text.toString() == "" || this.cre3.text.toString() == "" ||
                this.cre4.text.toString() == "" || this.cre5.text.toString() == "" || this.po1.text.toString() == "" || this.po2.text.toString() == "" ||
                this.po3.text.toString() == "" || this.po4.text.toString() == "" || this.po5.text.toString() == ""){
                miss.show()
            }else{
                val cre1 = cre1.getText().toString().toDouble()
                val cre2 = cre2.getText().toString().toDouble()
                val cre3 = cre3.getText().toString().toDouble()
                val cre4 = cre4.getText().toString().toDouble()
                val cre5 = cre5.getText().toString().toDouble()
                val gra1 = po1.getText().toString().toDouble()
                val gra2 = po2.getText().toString().toDouble()
                val gra3 = po3.getText().toString().toDouble()
                val gra4 = po4.getText().toString().toDouble()
                val gra5 = po5.getText().toString().toDouble()
                cred = cre1 + cre2 + cre3 + cre4 + cre5
                grade = (gra1 * cre1) + (gra2 * cre2) + (gra3 * cre3) + (gra4 * cre4) + (gra5 * cre5)
                gpa = grade / cred
                val gpa2dec = String.format("%.2f", gpa) ;
                total2.setText("$cred")
                gpa2.setText("$gpa2dec")
            }
        }
        clear2.setOnClickListener(){
            sub1.setText(null)
            sub2.setText(null)
            sub3.setText(null)
            sub4.setText(null)
            sub5.setText(null)
            cre1.setText(null)
            cre2.setText(null)
            cre3.setText(null)
            cre4.setText(null)
            cre5.setText(null)
            po1.setText(null)
            po2.setText(null)
            po3.setText(null)
            po4.setText(null)
            po5.setText(null)
            total2.setText(null)
            gpa2.setText(null)
            clear.show()
        }
    }
}

