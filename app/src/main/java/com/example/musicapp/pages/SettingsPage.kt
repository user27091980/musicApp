package com.example.musicapp.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SettingsScreen(/*viewModel: NavHostController*/) {

    //val darkMode by viewModel.darkMode.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "configuración",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Appearance
        SectionTitle("Appearance")

        SettingSwitch(
            title = "Dark Mode",
            checked = true,
            onCheckedChange = true,
        )

        // About
        SectionTitle("made by Andrés Canabal Poncela")

        SettingItem(
            title = "App Version",
            value = "1.0.0"
        )
    }
}

@Composable
fun SettingItem(title: String, value: String) {
    TODO("Not yet implemented")
}

@Composable
fun SectionTitle(x0: String) {
    TODO("Not yet implemented")
}

@Composable
fun SettingSwitch(
    title: String,
    checked: Boolean,
    onCheckedChange: Boolean
) {
    TODO("Not yet implemented")
}
