package com.example.a07ex03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Intent para chamada do navegado
        val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
        startActivity(myIntent)
        //Intent para chamada do telefone
        val myFone = Intent(Intent.ACTION_VIEW, Uri.parse("tel:17981351675"))
        startActivity(myFone)
        //Intent para chamada do email
        val myMail = Intent(Intent.ACTION_SEND)
        myMail.data = Uri.parse("mailto:")
        myMail.type = "message/rfc822"
        myMail.putExtra(Intent.EXTRA_EMAIL, arrayOf("adrianofortunatomachado@hotmail.com"))
        myMail.putExtra(Intent.EXTRA_SUBJECT, "Teste de Email")
        myMail.putExtra(Intent.EXTRA_TEXT, "Teste de Email para o exercicio passado")
        startActivity(myMail)
    }
}