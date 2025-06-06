package com.example.deliveryapp.presentation.screen.client.product.detail.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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

fun ClientProductDetailContent() {
    Column() {
        val images = listOf(
            R.drawable.pizzapepperoni,
            R.drawable.restauran,
            R.drawable.background,

            )

        val pagerState = rememberPagerState(pageCount = {
            images.size
        })
        HorizontalPager(state = pagerState) { page ->
            Card(
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

                Image(
                    painter = painterResource(id = images[page]), contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )


            }
        }

        Column(
            modifier = Modifier
                .weight(2f)
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Row {
                Text(
                    "PIZZA DE PEPERONI",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {

                        },
                    tint = Color.Blue
                )
            }
            Row {
                Text(
                    "$300.34",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                )
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {

                        },
                    tint = Color.Blue
                )
            }


            Text(
                "Deliosa pizza de peperoni con orilla rellena de queso philadelpia.",
                fontSize = 18.sp,
                modifier = Modifier
            )
            Text(
                "Editar descripcion",
                fontSize = 18.sp,
                color = Color.Blue,
                modifier = Modifier
                    .clickable {

                    }
            )

            OutlinedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp)
                    .height(100.dp)
            ) {


                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(4f)) {
                        Text("Costo de envio: MXN 39")
                        Text("Costo de total: MXN 39")

                    }
                    Divider(
                        modifier = Modifier
                            .weight(0.1f)
                            .padding(top = 20.dp, bottom = 20.dp)
                            .fillMaxHeight()
                    )

                    Column(modifier = Modifier.weight(4f)) {
                        Text("20 min")
                        Text("Tiempo de llegado")
                    }

                }


            }
            OutlinedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, bottom = 20.dp)
                    .height(50.dp)
            ) {
                Row(modifier = Modifier.padding(10.dp)) {
                    Text(
                        "INGREDIENTES",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier.weight(6f)

                    )
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                            .weight(1f)
                    )
                }


            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Cantidad:")

                Box(
                    modifier = Modifier
                        .size(height = 40.dp, width = 120.dp)
                        .clip(shape = RoundedCornerShape(30.dp))

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.LightGray),
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                "-",
                                textAlign = TextAlign.Center,
                                fontSize = 30.sp,
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth()

                            )
                            Text(
                                "1",
                                textAlign = TextAlign.Center,
                                fontSize = 25.sp,
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth()
                            )
                            Text(
                                "+",
                                textAlign = TextAlign.Center,
                                fontSize = 30.sp,
                                modifier = Modifier
                                    .weight(1f)
                                    .fillMaxWidth()
                            )
                        }
                    }

                }


            }
            Spacer(modifier = Modifier.height(40.dp))

        }


    }
}