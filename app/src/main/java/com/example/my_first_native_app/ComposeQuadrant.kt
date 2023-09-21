package com.example.my_first_native_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ComposeQuadrant() {
    Column {
        Box(modifier = Modifier.weight(1f)) {
            Row {
                Box(modifier = Modifier.weight(1f)) {
                    Surface(color = Color(0xFFEADDFF), modifier = Modifier.fillMaxHeight()) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(all = 16.dp),
                        ) {
                            Text(
                                text = "Text composable",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = 16.dp),
                            )
                            Text(
                                text = "Displays text and follows the recommended Material Design guidelines.",
                                textAlign = TextAlign.Justify,
                            )
                        }
                    }
                }

                Box(modifier = Modifier.weight(1f)) {
                    Surface(color = Color(0xFFD0BCFF), modifier = Modifier.fillMaxHeight()) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(all = 16.dp),
                        ) {
                            Text(
                                text = "Image composable",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = 16.dp),
                            )
                            Text(
                                text = "Creates a composable that lays out and draws a given Painter class object.",
                                textAlign = TextAlign.Justify,
                            )
                        }
                    }
                }
            }
        }
        Box(modifier = Modifier.weight(1f)) {
            Row {
                Box(modifier = Modifier.weight(1f)) {
                    Surface(color = Color(0xFFB69DF8), modifier = Modifier.fillMaxHeight()) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(all = 16.dp),
                        ) {
                            Text(
                                text = "Row composable",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = 16.dp),
                            )
                            Text(
                                text = "A layout composable that places its children in a horizontal sequence.",
                                textAlign = TextAlign.Justify,
                            )
                        }
                    }
                }
                Box(modifier = Modifier.weight(1f)) {
                    Surface(color = Color(0xFFF6EDFF), modifier = Modifier.fillMaxHeight()) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.padding(all = 16.dp),
                        ) {
                            Text(
                                text = "Column composable",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(bottom = 16.dp),
                            )
                            Text(
                                text = "A layout composable that places its children in a vertical sequence.",
                                textAlign = TextAlign.Justify,
                            )
                        }
                    }
                }
            }
        }
    }
}
