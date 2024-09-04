import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.up.exmaterial.ui.screen.HomeScreen
import br.edu.up.exmaterial.ui.screen.SegundaScreen
import br.edu.up.exmaterial.ui.screen.TerceiraScreen
import br.edu.up.exmaterial.ui.theme.Purple80

@Preview(
    device = Devices.PIXEL
)
//@Composable
//fun Layout(){
//
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color(0xFFFFF9C5)),
//        verticalArrangement = Arrangement.SpaceAround    ) {
//        Row(
//            modifier = Modifier.weight(1f)
//                .fillMaxWidth()
//                .background(Color(0xFFFF0000))
//        ) {
//        }
//        Row(
//            modifier = Modifier.weight(1f)
//                .fillMaxWidth()
//                .background(Color(0xFFFFDD00))
//        ) {
//        }
//        Row(
//            modifier = Modifier.weight(1f)
//                .fillMaxWidth()
//                .background(Color(0xFF2C9400))
//        ) {
//        }
//        Row(
//            modifier = Modifier.weight(1f)
//                .fillMaxWidth()
//                .background(Color(0xFF001972))
//        ) {
//        }
//    }
//
//}

//@Composable
//fun Layout(){
//
//    Column(modifier = Modifier
//        .background(Color(0xFFFFF9C5)),) {
//        Row(
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth()
//        ) {
//            Box(modifier = Modifier
//                .weight(1f)
//                .fillMaxSize()
//                .fillMaxWidth()
//                .background(Color(0xFFFF0000)))
//            Box(modifier = Modifier
//                .weight(1f)
//                .fillMaxSize()
//                .fillMaxWidth()
//                .background(Color(0xFFFFE800)))
//        }
//
//        Row(
//            modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth()
//        ) {
//            Box(modifier = Modifier
//                .weight(1f)
//                .fillMaxSize()
//                .fillMaxWidth()
//                .background(Color(0xFF289700)))
//            Box(modifier = Modifier
//                .weight(1f)
//                .fillMaxSize()
//                .fillMaxWidth()
//                .background(Color(0xFF001769)))
//        }
//
//    }
//
//
//
//}

@Composable
fun Layout(){

    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .background(Color.Red)
        ) {
            Column(modifier = Modifier.weight(1f)){
                Box (modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(Color(0xFFAA7676))){

                }
                Box (modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(Color(0xFFC02E2E))){

                }
            }

    }



}