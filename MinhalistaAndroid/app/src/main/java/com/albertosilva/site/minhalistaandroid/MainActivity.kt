import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yourproject.R

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val androidVersions = listOf(
                AndroidVersion("Android 4 Ice Cream Sandwich", R.drawable.ic_android_ice_cream_sandwich),
                AndroidVersion("Android 4.1 Jelly Bean", R.drawable.ic_android_jelly_bean),

            )

            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = AndroidVersionAdapter(androidVersions)
        }
    }
}
