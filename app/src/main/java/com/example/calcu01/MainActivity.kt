package com.example.calcu01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textnumber: TextView = findViewById(R.id.textnumber)

        val plus: Button = findViewById(R.id.plus)
        val minus: Button = findViewById(R.id.minus)
        val multi: Button = findViewById(R.id.multi)
        val divider: Button = findViewById(R.id.divider)
        val mod: Button = findViewById(R.id.mod)
        val point: Button = findViewById(R.id.point)
        val equal: Button = findViewById(R.id.equal)
        val clear: Button = findViewById(R.id.clear)
        val delete: Button = findViewById(R.id.delete)

        val num0: Button = findViewById(R.id.num0)
        val num1: Button = findViewById(R.id.num1)
        val num2: Button = findViewById(R.id.num2)
        val num3: Button = findViewById(R.id.num3)
        val num4: Button = findViewById(R.id.num4)
        val num5: Button = findViewById(R.id.num5)
        val num6: Button = findViewById(R.id.num6)
        val num7: Button = findViewById(R.id.num7)
        val num8: Button = findViewById(R.id.num8)
        val num9: Button = findViewById(R.id.num9)

        var currentNumber = "0"
        var number1 =""
        var number2 =""
        var otext =""
        var doot:Boolean = false



        clear.setOnClickListener {
            currentNumber = "0"
            textnumber.setText("0")
            doot = false
        }

        delete.setOnClickListener {
            if (currentNumber.length >1){
                currentNumber = currentNumber.substring(0,currentNumber.length-1)
                textnumber.setText(currentNumber)
            }else{
                textnumber.setText("0")
                currentNumber =""
            }
        }

        num0.setOnClickListener {
            //currentNumber = Tans.text.toString()
            if (currentNumber == "0") {
                currentNumber = "0"
                textnumber.setText("0")
            } else {
                currentNumber += "0"
                textnumber.text = currentNumber
            }
        }

        num1.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "1"
                textnumber.setText("1")
            }else{
                currentNumber += "1"
                textnumber.text = currentNumber
            }
        }

        num2.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "2"
                textnumber.setText("2")
            }else{
                currentNumber += "2"
                textnumber.text = currentNumber
            }
        }

        num3.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "3"
                textnumber.setText("3")
            }else{
                currentNumber += "3"
                textnumber.text = currentNumber
            }
        }

        num4.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "4"
                textnumber.setText("4")
            }else{
                currentNumber += "4"
                textnumber.text = currentNumber
            }
        }

        num5.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "5"
                textnumber.setText("5")
            }else{
                currentNumber += "5"
                textnumber.text = currentNumber
            }
        }

        num6.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "6"
                textnumber.setText("6")
            }else{
                currentNumber += "6"
                textnumber.text = currentNumber
            }
        }

        num7.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "7"
                textnumber.setText("7")
            }else{
                currentNumber += "7"
                textnumber.text = currentNumber
            }
        }

        num8.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "8"
                textnumber.setText("7")
            }else{
                currentNumber += "8"
                textnumber.text = currentNumber
            }
        }

        num9.setOnClickListener {
            if(currentNumber == "0"){
                currentNumber = "9"
                textnumber.setText("9")
            }else{
                currentNumber += "9"
                textnumber.text = currentNumber
            }
        }

        point.setOnClickListener {
            if (doot == false) {
                currentNumber += "."
                textnumber.setText(currentNumber)
                doot = true
            }
        }

        plus.setOnClickListener {
            otext = "+"
            number1 = currentNumber
            currentNumber = ""
            textnumber.text = "0"
            doot = false
        }

        minus.setOnClickListener {
            otext = "-"
            number1 = currentNumber
            currentNumber = ""
            textnumber.text = "0"
            doot = false
        }

        multi.setOnClickListener {
            otext = "*"
            number1 = currentNumber
            currentNumber = ""
            textnumber.text = "0"
            doot = false
        }

        divider.setOnClickListener {
            otext = "/"
            number1 = currentNumber
            currentNumber = ""
            textnumber.text = "0"
            doot = false
        }

        mod.setOnClickListener {
            otext = "%"
            number1 = currentNumber
            currentNumber = ""
            textnumber.text = "0"
            doot = false
        }

        equal.setOnClickListener {
            number2 = currentNumber
            var result = 0.0

            when (otext) {

                "+" -> result = number1.toDouble() + number2.toDouble()
                "-" -> result = number1.toDouble() - number2.toDouble()
                "*" -> result = number1.toDouble() * number2.toDouble()
                "/" -> result = number1.toDouble() / number2.toDouble()
                "%" -> result = number1.toDouble() % number2.toDouble()
            }
            if(result.toString() == "Infinity" ) {
                textnumber.text = "Error: Division by zero"
            }else {
                textnumber.text = result.toString() // Display the result
            }


//นำค่า result มาทำการคำนวณเพิ่ม เนื่องจากตอนแรก มันเอา number 2 มา +กับ ค่าที่พิมพ์ล่าสุด เราจึงต้อง เก็บค่า result ให้เป็น number1 เพื่อที่จะนำมา + กับ number 2
            number1 = result.toString()
            currentNumber = result.toString()
        }
        }
    }





