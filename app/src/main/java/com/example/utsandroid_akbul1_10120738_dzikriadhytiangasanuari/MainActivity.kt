package com.example.utsandroid_akbul1_10120738_dzikriadhytiangasanuari
// Kamis 6 Juni, Dzikri Adhytian Gasanuari, 10120738, AKB UL1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputName = findViewById<EditText>(R.id.inputName)
        val inputNim = findViewById<EditText>(R.id.inputNim)
        val inputClass = findViewById<EditText>(R.id.inputClass)
        val inputBirthDate = findViewById<EditText>(R.id.inputBirthDate)
        val radioGroupGender = findViewById<RadioGroup>(R.id.radioGroupGender)
        val inputRelationship = findViewById<EditText>(R.id.inputRelationship)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            val name = inputName.text.toString()
            val nim = inputNim.text.toString()
            val kelas = inputClass.text.toString()
            val birthDate = inputBirthDate.text.toString()
            val gender = if (radioGroupGender.checkedRadioButtonId == R.id.radioMale) "Laki-laki" else "Perempuan"
            val relationship = inputRelationship.text.toString()

            if (name.isEmpty() || nim.isEmpty() || kelas.isEmpty() || birthDate.isEmpty() || gender.isEmpty() || relationship.isEmpty()) {
                inputName.error = "Please enter a valid name"
                inputNim.error = "Please enter a valid NIM"
                inputClass.error = "Please enter a valid class"
                inputBirthDate.error = "Please enter a valid birth date"
                inputRelationship.error = "Please enter a valid relationship"
            } else {
                val intent = Intent(this, ReviewActivity::class.java).apply {
                    putExtra("EXTRA_NAME", name)
                    putExtra("EXTRA_NIM", nim)
                    putExtra("EXTRA_CLASS", kelas)
                    putExtra("EXTRA_BIRTH_DATE", birthDate)
                    putExtra("EXTRA_GENDER", gender)
                    putExtra("EXTRA_RELATIONSHIP", relationship)
                }
                startActivity(intent)
            }
        }
    }
}







