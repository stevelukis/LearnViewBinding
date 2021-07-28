package id.stevelukis.learnviewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.stevelukis.learnviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            binding.textView.setText(R.string.hello)
        }
    }
}