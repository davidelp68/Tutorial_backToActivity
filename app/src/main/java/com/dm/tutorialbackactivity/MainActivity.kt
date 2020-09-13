package com.dm.tutorialbackactivity

import android.content.Intent                           //importazione della Classe: Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            //dichiarazione della variabile apriPaginaDue e associazione della classe Intent
            //(this, nome della seconda Activity::class.java)
            val apriPaginaDue = Intent(this, SecondActivity::class.java)
            //avvio dell'Activity con passaggio della variabile apriPaginaDue
            startActivity(apriPaginaDue)
        }

    }
}
