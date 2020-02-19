package org.d3if4030.jurnal5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.d3if4030.jurnal5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
 private lateinit var binding:ActivityMainBinding
    private val ScoreA = 0
    private val ScoreB = 0



//    private lateinit var binding:


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.angka1.setOnClickListener(
//
//        )
    }
}
