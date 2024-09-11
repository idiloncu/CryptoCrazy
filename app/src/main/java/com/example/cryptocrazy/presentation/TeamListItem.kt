package com.example.cryptocrazy.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cryptocrazy.data.remote.TeamMember

@Composable
fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier=Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = teamMember.name,
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.bodyMedium,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
        )
    }
}