package com.giantstrideltd.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.giantstrideltd.swoosh.Model.Player
import com.giantstrideltd.swoosh.R
import com.giantstrideltd.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueTxt.text = "Searching for a ${player.league} ${player.skill} league near you...."
    }


}
