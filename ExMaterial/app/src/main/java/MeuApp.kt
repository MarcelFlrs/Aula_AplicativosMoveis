import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.exmaterial.R

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
        .background(Color.Black)) {

        Row(modifier = Modifier
            .background(Color.Red)
            .weight(1f)) {

            Column(modifier = Modifier
                .weight(1f)) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)){
                    Image(painter = painterResource(id = R.drawable.mar),
                        contentDescription = "Mar Imagem", contentScale = ContentScale.Companion.FillHeight)
                }
            }
            Column(modifier = Modifier.weight(1f)){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)) {
                    Column {
                        Row(modifier = Modifier.weight(1f)) {
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Red))
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Green))
                        }
                        Row (modifier = Modifier.weight(1f)) {
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Blue))

                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Yellow))

                        }
                    }
                }
            }
        }

        Row(modifier = Modifier
            .background(Color.Yellow)
            .weight(1f)) {
            Column(modifier = Modifier.weight(1f)){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)){
                    Column {
                        Row(modifier = Modifier.weight(1f)) {
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Red))
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Green))
                        }
                        Row (modifier = Modifier.weight(1f)) {
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Blue))

                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Yellow))

                        }
                    }
                }

            }
            Column(modifier = Modifier.weight(1f)){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)) {
                    Image(painter = painterResource(id = R.drawable.farol),
                        contentDescription = "Farol Imagem", contentScale = ContentScale.Companion.FillBounds)
                }
            }
        }

        Row(modifier = Modifier
            .background(Color.Green)
            .weight(1f)) {
            Column(modifier = Modifier.weight(1f)){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)) {
                    Image(painter = painterResource(id = R.drawable.gato),
                        contentDescription = "Gato Imagem", contentScale = ContentScale.Companion.FillHeight)
                }
            }

            Column(modifier = Modifier.weight(1f)){
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f)) {
                    Column {
                        Row(modifier = Modifier.weight(1f)) {
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Red))
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Yellow))
                        }

                        Row (modifier = Modifier.weight(1f)){
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Green))
                            Box(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .weight(1f)
                                .background(Color.Blue))
                        }
                    }
                }
            }
        }

    }
}

