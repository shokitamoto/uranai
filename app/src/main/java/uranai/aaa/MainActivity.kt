package uranai.aaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fortuneButton.setOnClickListener {
            val resResult: Fortune = Fortune().getFortune()
            result.text = resResult.name
            description.text = resResult.description
        }

    }
}
