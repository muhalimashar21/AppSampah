package com.example.appsampah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paket_layanan_kost.*

class PaketLayananKost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paket_layanan_kost)
        lk2.setOnClickListener {
            startActivity(Intent(this, KonfirmasiLayananKost::class.java))
        }
    }
}
