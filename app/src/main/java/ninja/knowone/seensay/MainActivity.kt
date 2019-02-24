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

        when (btnPressed) {
            btnBee -> playStuff(R.raw.bee)
            btnCat -> playStuff(R.raw.cat)
            btnCow -> playStuff(R.raw.cow)
            btnDog -> playStuff(R.raw.dog)
            btnDuck -> playStuff(R.raw.duck)
            btnFish -> playStuff(R.raw.fish)
            btnGorilla -> playStuff(R.raw.gorilla)
            btnOwl -> playStuff(R.raw.owl)
            btnSheep -> playStuff(R.raw.sheep)
        }
    }

    private fun playStuff(audio: Int) {

        mediaPlayer = MediaPlayer.create(this, audio)
        mediaPlayer.start()
    }
}
