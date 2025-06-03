package com.example.deliveryapp.presentation.screen.admin.product.detail.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import com.example.deliveryapp.R
import kotlin.math.absoluteValue

@Composable

fun ClientProductDetailContent(){
    Column(){
        val images = listOf(
            R.drawable.pizzapepperoni,
            R.drawable.restauran,
            R.drawable.background,

        )

        val pagerState = rememberPagerState(pageCount = {
           images.size
        })
        HorizontalPager(state = pagerState) { page ->
            Card (
                Modifier
                    .size(420.dp)
                    .graphicsLayer {
                        // Calculte the absolute offset for the current page from the
                        // scroll position. We use the absolute value which allows us to mirror
                        // any effects for both directions
                        val pageOffset = (
                                (pagerState.currentPage - page) + pagerState
                                    .currentPageOffsetFraction
                                ).absoluteValue

                        // We animate the alpha, between 50% and 100%
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        )
                    }
            ) {

                    Image(painter = painterResource(id = images[page])
                        , contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop)


            }
        }

        Column (modifier = Modifier.weight(2f).padding(20.dp)) {
            Text("Jugo de Guabana",
            fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 20.dp))
            Text("DESCRIPCION",
                fontSize = 20.sp,
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(bottom = 6.dp))
            Text("200 mil de jugo natural",
                fontSize = 18.sp,
                modifier = Modifier)
        }
        Spacer(modifier = Modifier.weight(2f))


        Row(modifier = Modifier.fillMaxWidth().padding(20.dp), verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = {},
                modifier = Modifier.weight(1f),
                shape = (RoundedCornerShape(200.dp))
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "",
                    modifier = Modifier.size(30.dp).fillMaxSize()
                )
            }
            Text("0",
                modifier = Modifier.weight(1f).fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Button(
                onClick = {},
                modifier = Modifier.weight(1f),
                shape = (RoundedCornerShape(200.dp))
            ) {
                Text("+")
            }
            Spacer(modifier = Modifier.weight(2f))
            Text("4000.00",
                modifier = Modifier.weight(2f))
        }
        Button(
            onClick = {

            },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.padding(20.dp).fillMaxWidth()
        ) {
            Text("Agregar Poducto")
        }


    }

}