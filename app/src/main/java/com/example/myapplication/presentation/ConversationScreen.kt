package com.example.myapplication.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.data.DummyData
import com.example.myapplication.model.Pesan
import com.example.myapplication.model.Convo
import com.example.myapplication.presentation.component.PesanItem
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun ConversationScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    pesansId: Int?,
) {
    val convoList = DummyData.listConvo
    val matchingConvos = convoList.filter { it.pesanId == pesansId }

    Column(
        modifier = modifier.fillMaxSize(), // Fill the entire available space
        horizontalAlignment = Alignment.CenterHorizontally, // Center horizontally
        verticalArrangement = Arrangement.Center // Center vertically
    ) {
        matchingConvos.forEach { convo ->
            DetailConversationContent(convo = convo, modifier = Modifier)
        }
    }
}

@Composable
fun DetailConversationContent(
    convo: Convo,
    modifier: Modifier,
) {
    val isOdd = convo.id % 2 != 0
    val alignment = if (isOdd) Alignment.Start else Alignment.End

    LazyColumn(modifier = modifier) {
        item {
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End.takeIf { !isOdd } ?: Arrangement.Start,
                modifier = modifier
                    .fillMaxWidth()
            ) {
                if (isOdd) {
                    Image(
                        painter = painterResource(id = convo.photo),
                        contentDescription = convo.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(65.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Column(
                        horizontalAlignment = alignment
                    ) {
                        Text(text = convo.name, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(3.dp))
                        Row {
                            Text(text = convo.detail, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
                if (!isOdd) {
                    Spacer(modifier = Modifier.width(5.dp))
                    Column(
                        horizontalAlignment = alignment
                    ) {
                        Text(text = convo.name, style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(3.dp))
                        Row {
                            Text(text = convo.detail, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Image(
                        painter = painterResource(id = convo.photo),
                        contentDescription = convo.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(65.dp)
                    )

                }

            }
        }
    }

}

