
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(
    device = Devices.PIXEL
)
@Composable
fun ExLayout(){
    Column (modifier = Modifier.fillMaxSize()){
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFF1A6883)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text("A",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(3.dp)
                    .background(Color.White)
                    .padding(3.dp)
                    .width(20.dp)
                    .weight(1f)
            )
            Text("B",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(3.dp)
                    .background(Color.White)
                    .padding(3.dp)
                    .width(20.dp)
                    .weight(1f)
            )
            Text("C",
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(3.dp)
                    .background(Color.White)
                    .padding(3.dp)
                    .width(20.dp)
                    .weight(1f)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF184FB1)),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Texto("A")
            Texto("B")
            Texto("C")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF8E2A99)),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Texto("A")
            Texto("B")
            Texto("C")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFB9E006)),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Texto("A")
            Texto("B")
            Texto("C")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFE04B06)),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Texto("A")
            Texto("B")
            Texto("C")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFAD0000)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Texto("A")
            Texto("B")
            Texto("C")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFFDF4646)),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Texto("A")
            Texto("B")
            Texto("C")
        }
    }
}



@Composable
fun Texto(txt:String){
    Text(
        text = txt,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(3.dp)
            .background(Color.White)
            .padding(3.dp)
            .width(70.dp)
    )
}

