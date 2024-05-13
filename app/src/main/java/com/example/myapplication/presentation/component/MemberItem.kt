package com.example.myapplication.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.model.Member
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun MemberItem(
    member: Member,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(member.id)
        }
    ) {
        Image(
            painter = painterResource(id = member.photo),
            contentDescription = member.name, modifier = Modifier
                .clip(CircleShape)
                .size(100.dp)
        )
        Text(
            text = member.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(90.dp),
            maxLines = 1
        )
        Text(
            text = member.nickname,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(80.dp),
            textAlign = TextAlign.Center,
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemHorizontalPreview() {
    MyApplicationTheme {
        MemberItem(
            member = Member(1, "Choi SeungCheol", "S.Coups", "Mobile", R.drawable.scoups),
            onItemClicked = { memberId ->
                println("Mentor Id : $memberId")
            }
        )
    }
}