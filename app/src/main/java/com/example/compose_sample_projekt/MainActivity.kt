package com.example.compose_sample_projekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//---------------------------------------------------------------------------------------------\\
            /*  Column(
                  modifier = Modifier
                      .fillMaxWidth()
                      .fillMaxHeight()
                      .background(Color.Cyan),
                  horizontalAlignment = Alignment.CenterHorizontally,
                  verticalArrangement = Arrangement.SpaceAround
              ) {
                  Text("Hello")
                  Text("World")
                  Text("Hello")
                  Text("World")
              }

              Row (modifier = Modifier
                  .fillMaxWidth()
                  .background(Color.Green),
              verticalAlignment = Alignment.CenterVertically,
              horizontalArrangement = Arrangement.SpaceAround
              ){
                  Text("Hello")
                  Text("World")
                  Text("Hello")
                  Text("World")
              }*/
//---------------------------------------------------------------------------------------------\\
            /*   Column(
                   modifier = Modifier
                       .background(Color.Cyan)
                       .fillMaxHeight(0.5f)
                       .fillMaxWidth()
                       .border(7.dp, Color.Magenta)
                       .padding(7.dp)
                       .border(7.dp, Color.Blue)
                       .padding(7.dp)
                       .border(7.dp, Color.Yellow)
                       .padding(7.dp),
                   horizontalAlignment = Alignment.CenterHorizontally,
                   verticalArrangement = Arrangement.SpaceAround
               ) {
                   Text("Hello Word")
                   Spacer(modifier = Modifier.height(100.dp))
                   Text(
                       "Hello Word", modifier = Modifier
                           .border(2.dp, Color.Red)
                           .padding(2.dp)
                           .border(1.dp,Color.Black)
                   )
                   Spacer(modifier = Modifier.height(100.dp))
                   Text("Ahoj")
               }

            */
//---------------------------------------------------------------------------------------------\\

            /*    val painter = painterResource(id = R.drawable.kermit)
                  val description = "Kermit in the snow"
                  val title = "Kermit palying in the snow"

                  Box(
                      modifier = Modifier
                          .fillMaxWidth(0.5f)
                          .fillMaxHeight(0.5f)
                          .padding(10.dp)
                  ) {

                      ImageCard(painter = painter, contentDescription = description, title = title)
                  }

             */
//---------------------------------------------------------------------------------------------\\

            /*    Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF101010))
                ) {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Green,
                                    fontSize = 30.sp
                                )
                            ){
                                append("J")
                            }
                            append("etpack ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Green,
                                    fontSize = 30.sp
                                )
                            ){
                                append("C")
                            }
                            append("ompose ")
                        },
                        color = Color.White,
                        fontSize = 30.sp,
                        textDecoration = TextDecoration.Underline
                    )

                }

             */
//---------------------------------------------------------------------------------------------\\

            /*    Column(Modifier.fillMaxSize()) {
    
                    val color = remember {
                        mutableStateOf(Color.Yellow)
                    }
    
                    ColorBox(
                        Modifier
                            .weight(1f)
                            .fillMaxSize()
                    ) {
                        color.value = it
                    }
    
                    Box(
                        modifier = Modifier
                            .background(color.value)
                            .weight(1f)
                            .fillMaxSize()
                    )
    
                }
    
    
             */
//---------------------------------------------------------------------------------------------\\
/*
            val scaffoldState = rememberScaffoldState()
            var textFieldState by remember{
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()

            Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ) {


                    TextField(
                        value = textFieldState,
                        label = {
                            Text("Enter your name")
                        },
                        onValueChange = {
                            textFieldState = it
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        scope.launch {
                        scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldState")
                        }
                    }){
                        Text("Pls greet me")
                    }

                }

            }

 */
//---------------------------------------------------------------------------------------------\\




        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {

    Card(

        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp,
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
        ) {

            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black),
                            startY = 300f
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }

        }
    }
}


@Composable
fun ColorBox(
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {

    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f))
        })

}