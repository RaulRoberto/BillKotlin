package com.example.divideconta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.divideconta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            calcBill()
        }
    }

    fun calcBill(){
        val valbill = binding.edtBill.text.toString().toDouble()
        val valservice = binding.edtServices.text.toString().toDouble()
        val valcrew = binding.edtCrew.text.toString().toInt()

        val bill = Bill(valbill,valservice,valcrew)

        binding.txtBillCrew.text = "Bill value per person: $ ${bill.calcBillPerPerson()}"
        binding.txtServices.text = "Services per person: $ ${bill.calcServicePerPerson()}"
        binding.txtTotalBill.text = "Total value per person: $ ${bill.calcServicePerPerson()+bill.calcBillPerPerson()}"
    }
}