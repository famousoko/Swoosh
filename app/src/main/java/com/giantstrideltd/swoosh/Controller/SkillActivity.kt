package com.giantstrideltd.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.giantstrideltd.swoosh.Model.Player
import com.giantstrideltd.swoosh.R
import com.giantstrideltd.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onsaveInstanceState(outState: Bundle?) {
        super.onsaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerClick(view: View){
        ballerBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClick(view: View){
        beginnerBtn.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClick(view: View){
        if (player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else{
            Toast.makeText(this , "Please select skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
