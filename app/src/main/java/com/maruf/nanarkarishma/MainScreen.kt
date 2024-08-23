import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello World!",
            fontSize = 24.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            // Handle button click
        }) {
            Text(text = "Click Me")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ShareButton() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                // Handle share action here
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White // Background color
            ),
            border = BorderStroke(2.dp, Color.Black), // Border stroke color and width
            shape = RoundedCornerShape(4.dp), // Rounded corners
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Share",
                color = Color.Black, // Text color
                fontSize = 16.sp
            )
        }
    }
}