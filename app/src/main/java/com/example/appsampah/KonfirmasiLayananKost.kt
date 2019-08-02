package com.example.appsampah

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_konfirmasi_layanan_kost.*
import kotlinx.android.synthetic.main.activity_paket_layanan_kost.*

class KonfirmasiLayananKost : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_layanan_kost)
        konfirmasikost.setOnClickListener {
            startActivity(Intent(this, CentangLayananKost::class.java))
        }
    }
}
