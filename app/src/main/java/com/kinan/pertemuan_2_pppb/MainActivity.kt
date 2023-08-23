package com.kinan.pertemuan_2_pppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kinan.pertemuan_2_pppb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        with(binding){
            txtNumber.text = number.toString()

            // change background color
            txtNumber.setBackgroundResource(R.color.purple )
            txtCount.setBackgroundResource(R.color.pink)

            btnCount.setOnClickListener{
                number ++
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener{
                Toast.makeText(this@MainActivity,number.toString(),Toast.LENGTH_SHORT).show()
            }
        }
    }
}