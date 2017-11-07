package com.giantstrideltd.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.giantstrideltd.swoosh.R
import com.giantstrideltd.swoosh.Utilities.EXTRA_LEAGUE
import com.giantstrideltd.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueTxt.text = "Searching for a $league $skill league near you...."
    }


}
