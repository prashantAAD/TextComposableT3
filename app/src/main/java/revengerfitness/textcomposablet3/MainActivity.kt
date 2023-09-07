package revengerfitness.textcomposablet3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "prashant chauhan")
        }
    }
}
@Preview(showBackground = true,name = "hello messege", showSystemUi = true)
@Composable
private fun PreviewFunction(){
    Text(
        text = "prashant chauhan",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Cyan,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
    )
}

