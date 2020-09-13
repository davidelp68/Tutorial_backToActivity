package com.dm.tutorialbackactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Actionbar per tornare indietro
        val actionbar = supportActionBar
        //Impostazione titolo dell'ActionBar
        actionbar!!.title = resources.getString(R.string.app_name)
        //attivazione del tasto Indietro nell'ActionBar
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    //gestione del clic del pulsante per tornare indietro
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
