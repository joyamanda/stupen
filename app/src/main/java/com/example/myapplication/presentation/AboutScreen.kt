package com.example.myapplication.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.data.DummyData
import com.example.myapplication.model.About
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
    about: List<About> = DummyData.aboutMe
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {

        Spacer(modifier = Modifier)
        Column(modifier = Modifier.padding(4.dp)) {
            Image(
                painter = painterResource(id = about[0].photo),
                contentDescription = about[0].name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(200.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = about[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = about[0].name,
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = about[0].uni,
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = about[0].major,
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Email : ${about[0].email}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    MyApplicationTheme {
        AboutScreen(about = DummyData.aboutMe)
    }
}

