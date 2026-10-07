package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BusinessCardScreen() }
    }
}

@Composable
fun BusinessCardScreen() {
    val bg = Color(0xFFE6F6EA)
    val androidGreen = Color(0xFF3DDC84)

    Surface(modifier = Modifier.fillMaxSize(), color = bg) {
        Box(Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .padding(bottom = 28.dp)
                )
                Text(
                    text = "Carlos Youssef",
                    fontSize = 48.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    lineHeight = 52.sp
                )
                Spacer(Modifier.height(12.dp))
                Text(
                    text = "Android Developer Extraordinaire",
                    fontSize = 18.sp,
                    color = Color(0xFF1B5E20),
                    fontWeight = FontWeight.Bold
                )
            }

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp, bottom = 28.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                ContactRow(Icons.Filled.Phone, "+324 25 25 25 25", androidGreen)
                ContactRow(Icons.Filled.Share, "@AndroidDev", androidGreen)
                ContactRow(Icons.Filled.Email, "Carlos@android.com", androidGreen)
            }
        }
    }
}

@Composable
fun ContactRow(icon: ImageVector, text: String, tint: Color) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = icon, contentDescription = null, tint = tint, modifier = Modifier.size(26.dp))
        Spacer(Modifier.width(18.dp))
        Text(text = text, fontSize = 18.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewBusinessCard() {
    BusinessCardScreen()
}
