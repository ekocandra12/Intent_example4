package com.example.intentexample4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Web")
        menu?.add("Map")
        menu?.add("Phone number")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var m_uri: Uri
        var m_intent = Intent()
        when (item?.toString()){
            "Web" -> {
                m_uri = Uri.parse("https://www.apress.com")
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
            }
            "Map" -> {
                m_uri = Uri.parse("geo:40.7113399,-74.0263469")
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
            }
            "Phone number" ->{
                m_uri = Uri.parse("tel:639285083333")
                m_intent = Intent(Intent.ACTION_DIAL, m_uri)
            }
        }
        startActivity(m_intent)
        return true
    }
}