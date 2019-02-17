package ninja.knowone.seensay

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {

        val btnPressed = view as ImageButton

        when (btnPressed.id) {
            btnBee.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.bee)
                mediaPlayer.start()}
            btnCat.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.cat)
                mediaPlayer.start()}
            btnCow.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.cow)
                mediaPlayer.start()}
            btnDog.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.dog)
                mediaPlayer.start()}
            btnDuck.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.duck)
                mediaPlayer.start()}
            btnFish.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.fish)
                mediaPlayer.start()}
            btnGorilla.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.gorilla)
                mediaPlayer.start()}
            btnOwl.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.owl)
                mediaPlayer.start()}
            btnSheep.id -> {mediaPlayer = MediaPlayer.create(this, R.raw.sheep)
                mediaPlayer.start()}
        }
    }
}
