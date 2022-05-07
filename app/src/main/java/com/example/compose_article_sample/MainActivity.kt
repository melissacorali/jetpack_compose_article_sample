package com.example.compose_article_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article_sample.ui.theme.Compose_Article_SampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_Article_SampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleImage(paragraph1 = stringResource(R.string.paragraph_1_text), paragraph2 = stringResource(
                        R.string.paragraph_2_text), paragraph3 = stringResource(R.string.paragraph_3_text)
                    )
                }
            }
        }
    }
}
@Composable
fun ArticleImage(paragraph1: String, paragraph2: String, paragraph3: String){
  val image = painterResource(id = R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()

        )
        ArticleText(paragraph1 = paragraph1, paragraph2 = paragraph2, paragraph3 = paragraph3)
    }

}

@Composable
fun ArticleText(paragraph1: String, paragraph2: String, paragraph3: String) {
    Column{
        Text(text = paragraph1, fontSize = 24.sp, modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp ))
        Text(text = paragraph2 , textAlign = TextAlign.Justify, modifier = Modifier.padding(start = 16.dp, end = 16.dp))
        Text(text = paragraph3, textAlign = TextAlign.Justify, modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp ))
    }

}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    Compose_Article_SampleTheme {
        ArticleImage(paragraph1 = stringResource(R.string.paragraph_1_text), paragraph2 = stringResource(
                    R.string.paragraph_2_text), paragraph3 = stringResource(R.string.paragraph_3_text)
                            )
    }
}