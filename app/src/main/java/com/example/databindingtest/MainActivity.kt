package com.example.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingtest.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     lateinit var binding:ActivityMainBinding //primitive data type can't use lateinit
     //One-way Binding (can be used String)
    var person:Person= Person("James","Android Developer","No.105 Hledan,Hlaing")
    var person1:Person= Person("Mya Mya","Marketing","No.55 Insein,Yangon")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        //binding.txtName.text=person.name
        //binding.txtOccupation.text=person.occupation
        binding.myPerson=person

        btnOne.setOnClickListener {
            binding.myPerson=person1
        }
    }
}
