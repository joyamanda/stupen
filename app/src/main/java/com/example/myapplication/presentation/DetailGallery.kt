package com.example.myapplication.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.data.DummyData
import com.example.myapplication.model.Member
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.myapplication.model.Gallery

@Composable
fun DetailGallery(
    modifier: Modifier = Modifier,
    navController: NavController,
    gallerysId: Int?
) {
    val galleryList = DummyData.infiniteGalleries.filter { gallery ->
        gallery.id == gallerysId
    }

    Column(
        modifier = modifier.fillMaxSize(), // Fill the entire available space
        horizontalAlignment = Alignment.CenterHorizontally, // Center horizontally
        verticalArrangement = Arrangement.Center // Center vertically
    ) {
        DetailGalleryContent(galleryList = galleryList)
    }


}

@Composable
private fun DetailGalleryContent(
    galleryList: List<Gallery>,
    modifier: Modifier = Modifier
) {
    var isLiked by rememberSaveable { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = modifier.padding(16.dp)
    ) {

        Spacer(modifier = Modifier)
        Column(modifier = Modifier.padding(4.dp)) {
            Image(
                painter = painterResource(id = galleryList[0].photo),
                contentDescription = galleryList[0].name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = galleryList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = galleryList[0].detail,
                style = MaterialTheme.typography.titleMedium,
            )
            IconButton(
                onClick = { isLiked = !isLiked }, // Toggle like status on button click
                modifier = Modifier.size(48.dp) // Set button size
            ) {
                // Change the icon based on like status
                Icon(
                    imageVector = if (isLiked) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                    contentDescription = "Like"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailGalleryContentPreview() {
    DetailGalleryContent(galleryList = DummyData.infiniteGalleries)
}