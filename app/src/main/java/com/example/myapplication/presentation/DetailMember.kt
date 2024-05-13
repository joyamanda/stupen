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

@Composable
fun DetailMember(
    modifier: Modifier = Modifier,
    navController: NavController,
    membersId: Int?
) {
    val newMembersList = DummyData.mobileMembers.filter { member ->
        member.id == membersId
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        DetailMemberContent(newMembersList = newMembersList)
    }


}

@Composable
private fun DetailMemberContent(
    newMembersList: List<Member>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {

        Spacer(modifier = Modifier)
        Column(modifier = Modifier.padding(4.dp)) {
            Image(
                painter = painterResource(id = newMembersList[0].photo),
                contentDescription = newMembersList[0].nickname,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(200.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = newMembersList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = newMembersList[0].nickname,
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = "Unit : ${newMembersList[0].unit}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailMentorContentPreview() {
    DetailMemberContent(newMembersList = DummyData.mobileMembers)
}