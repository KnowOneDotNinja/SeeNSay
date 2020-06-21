package ninja.knowone.seensay

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
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

    @SuppressLint("SetTextI18n")
    fun btnClick(view: View) {

        val btnPressed = view as ImageButton

        when (btnPressed.id) {
            btnBee.id -> {
                play(R.raw.bee)
                animalTextView.text = "Bee"
            }
            btnCat.id -> {
                play(R.raw.cat)
                animalTextView.text = "Cat"
            }
            btnCow.id -> {
                play(R.raw.cow)
                animalTextView.text = "Cow"
            }
            btnDog.id -> {
                play(R.raw.dog)
                animalTextView.text = "Dog"
            }
            btnDuck.id -> {
                play(R.raw.duck)
                animalTextView.text = "Duck"
            }
            btnFish.id -> {
                play(R.raw.fish)
                animalTextView.text = "Fish"
            }
            btnGorilla.id -> {
                play(R.raw.gorilla)
                animalTextView.text = "Gorilla"
            }
            btnOwl.id -> {
                play(R.raw.owl)
                animalTextView.text = "Owl"
            }
            btnSheep.id -> {
                play(R.raw.sheep)
                animalTextView.text = "Sheep"
            }
        }
    }

    fun play(audioTrack: Int) {
        mediaPlayer = MediaPlayer.create(this, audioTrack)
        mediaPlayer.start()
    }
}
