package com.example.myapplication.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.example.myapplication.R
import com.example.myapplication.model.Pesan
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun PesanItem(
    pesan: Pesan,
    modifier: Modifier = Modifier,
) {
    Column {
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = pesan.photo),
                contentDescription = pesan.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(65.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = pesan.name, style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(3.dp))
                Row {
                    Text(text = pesan.detail, style = MaterialTheme.typography.bodyMedium)
                }
            }

        }

    }

}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    MyApplicationTheme {
        PesanItem(
            pesan = Pesan(
                1,
                "Mingoo❤️",
                R.drawable.mingyu,
                "Batch 7",
            )
        )
    }
}