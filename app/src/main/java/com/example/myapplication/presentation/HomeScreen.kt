package com.example.myapplication.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.data.DummyData
import com.example.myapplication.model.Pesan
import com.example.myapplication.model.Member
import com.example.myapplication.navigation.Screen
import com.example.myapplication.presentation.component.PesanItem
import com.example.myapplication.presentation.component.MemberItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    members: List<Member> = DummyData.mobileMembers,
    pesans: List<Pesan> = DummyData.mobilePesans,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = modifier

    ) {
        item {
            Text(
                text = "Member Seventeen",
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            LazyRow(
                contentPadding = PaddingValues(10.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                modifier = modifier
            ) {
                items(members, key = { it.id }) {
                    MemberItem(member = it) { memberId ->
                        navController.navigate(Screen.Detail.route + "/$memberId")
                    }
                }
            }
        }
        item {
            Text(
                text = "Pesan",
                modifier = Modifier.padding(horizontal = 10.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
        itemsIndexed(pesans) { index, pesan ->
            PesanItem(pesan = pesan, modifier = Modifier
                .padding(horizontal = 16.dp)
                .clickable {
                    navController.navigate(Screen.Message.route + "/${pesan.id}")
                })
        }

    }
}