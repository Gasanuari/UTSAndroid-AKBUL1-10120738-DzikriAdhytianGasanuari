package com.example.utsandroid_akbul1_10120738_dzikriadhytiangasanuari
// Kamis 6 Juni, Dzikri Adhytian Gasanuari, 10120738, AKB UL1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val displayName = findViewById<TextView>(R.id.displayName)
        val displayNim = findViewById<TextView>(R.id.displayNim)
        val displayClass = findViewById<TextView>(R.id.displayClass)
        val displayBirthDate = findViewById<TextView>(R.id.displayBirthDate)
        val displayGender = findViewById<TextView>(R.id.displayGender)
        val displayRelationship = findViewById<TextView>(R.id.displayRelationship)
        val btnEdit = findViewById<Button>(R.id.btnEdit)
        val btnSave = findViewById<Button>(R.id.btnSave)

        val name = intent.getStringExtra("EXTRA_NAME")
        val nim = intent.getStringExtra("EXTRA_NIM")
        val kelas = intent.getStringExtra("EXTRA_CLASS")
        val birthDate = intent.getStringExtra("EXTRA_BIRTH_DATE")
        val gender = intent.getStringExtra("EXTRA_GENDER")
        val relationship = intent.getStringExtra("EXTRA_RELATIONSHIP")

        displayName.text = "Nama: $name"
        displayNim.text = "NIM: $nim"
        displayClass.text = "Kelas: $kelas"
        displayBirthDate.text = "Tanggal Lahir: $birthDate"
        displayGender.text = "Jenis Kelamin: $gender"
        displayRelationship.text = "Hubungan dengan Anda: $relationship"

        btnEdit.setOnClickListener {
            finish()
        }

        btnSave.setOnClickListener {
            val intent = Intent(this, SuccessActivity::class.java)
            startActivity(intent)
        }
    }
}





