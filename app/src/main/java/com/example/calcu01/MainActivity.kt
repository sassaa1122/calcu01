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

        var text1 =""
        var number1 =""
        var number2 =""
        var otext =""



        clear.setOnClickListener{
            textnumber.setText("0")
            text1 =""
        }

        delete.setOnClickListener{
            if (text1.length >1){
                text1=text1.substring(0,text1.length-1)
                textnumber.setText(text1)
            }else{
                textnumber.setText("0")
                text1 =""
            }
        }

        num0.setOnClickListener{
            if(text1 == ""){
                text1=""
            } else{
                text1 +=0
                textnumber.setText(text1)
            }
        }

        num1.setOnClickListener{
            text1 +=1
            textnumber.setText(text1)
        }

        num2.setOnClickListener{
            text1 +=2
            textnumber.setText(text1)
        }

        num3.setOnClickListener{
            text1 +=3
            textnumber.setText(text1)
        }
        num4.setOnClickListener{
            text1 +=4
            textnumber.setText(text1)
        }
        num5.setOnClickListener{
            text1 +=5
            textnumber.setText(text1)
        }
        num6.setOnClickListener{
            text1 +=6
            textnumber.setText(text1)
        }
        num7.setOnClickListener{
            text1 +=7
            textnumber.setText(text1)
        }
        num8.setOnClickListener{
            text1 +=8
            textnumber.setText(text1)
        }
        num9.setOnClickListener{
            text1 +=9
            textnumber.setText(text1)
        }

//        plus.setOnClickListener{
//            text2=text1.toInt()
//            text3 +="+"
//            text1 =""
//            textnumber.setText(text3)
//        }
//
//        equal.setOnClickListener{
//            if(text3 == "+"){
//                var number1= text1.
//                textnumber.setText(text1)
//            }
//        }


        plus.setOnClickListener {
            otext = "+"
            number1 = text1
            text1 = ""
            textnumber.text = "0"
        }

        minus.setOnClickListener {
            otext = "-"
            number1 = text1
            text1 = ""
            textnumber.text = "0"
        }

        multi.setOnClickListener {
            otext = "*"
            number1 = text1
            text1 = ""
            textnumber.text = "0"
        }

        divider.setOnClickListener {
            otext = "/"
            number1 = text1
            text1 = ""
            textnumber.text = "0"
        }

        mod.setOnClickListener {
            otext = "%"
            number1 = text1
            text1 = ""
            textnumber.text = "0"
        }

        equal.setOnClickListener {
            number2 = text1
            var result = 0.0
            try {
                when (otext) {
                    "+" -> result = number1.toDouble() + number2.toDouble()
                    "-" -> result = number1.toDouble() - number2.toDouble()
                    "*" -> result = number1.toDouble() * number2.toDouble()
                    "/" -> {
                        if (number2.toDouble() == 0.0) {
                            textnumber.text = "Error: Division by zero"
                        } else {
                            result = number1.toDouble() / number2.toDouble()
                        }
                    }
                    "%" -> result = number1.toDouble() % number2.toDouble()
                }
                textnumber.text = result.toString() // Display the result
            } catch (e: NumberFormatException) {
                textnumber.text = "Error: Invalid input"
            }
        }
    }
}


