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
            btnBee.id -> play(R.raw.bee)
            btnCat.id -> play(R.raw.cat)
            btnCow.id -> play(R.raw.cow)
            btnDog.id -> play(R.raw.dog)
            btnDuck.id -> play(R.raw.duck)
            btnFish.id -> play(R.raw.fish)
            btnGorilla.id -> play(R.raw.gorilla)
            btnOwl.id -> play(R.raw.owl)
            btnSheep.id -> play(R.raw.sheep)
        }
    }

    fun play(audioTrack: Int) {
        mediaPlayer = MediaPlayer.create(this, audioTrack)
        mediaPlayer.start()
    }
}
