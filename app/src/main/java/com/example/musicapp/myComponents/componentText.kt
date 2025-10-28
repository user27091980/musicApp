package com.example.musicapp.myComponents






import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ComponentText(
    label: String,
    type: FieldType = FieldType.Text
) {
    var value by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    val visualTransformation = when (type) {
        FieldType.Password -> PasswordVisualTransformation()
        else -> VisualTransformation.None
    }

    val keyboardType = when (type) {
        FieldType.Email -> KeyboardType.Email
        FieldType.Phone -> KeyboardType.Phone
        FieldType.Number -> KeyboardType.Number
        FieldType.Password -> KeyboardType.Password
        else -> KeyboardType.Text
    }

    val icon = when (type) {
        FieldType.Email -> Icons.Default.Email
        FieldType.Password -> Icons.Default.Lock
        FieldType.Phone -> Icons.Default.Phone
        else -> Icons.Default.Person // Incluye Number y Text
    }




    OutlinedTextField(
        value = value,
        onValueChange = {
            value = it
            isError = when (type) {
                FieldType.Email -> !android.util.Patterns.EMAIL_ADDRESS.matcher(it).matches()
                FieldType.Number -> it.toIntOrNull() == null
                FieldType.Password -> it.length < 6
                else -> false
            }
        },
        label = { Text(label) },
        leadingIcon = { Icon(icon, contentDescription = null) },
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        textStyle = TextStyle(fontSize = 16.sp),
        modifier = Modifier.fillMaxWidth()
    )
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun componentTextPreview(){
    ComponentText (label = "", )
}