package com.gassistant.dailyinspowidgetdemo.widget

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.components.FilledButton
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.*
import androidx.glance.text.*
import androidx.glance.unit.ColorProvider

class QuoteWidget : GlanceAppWidget() {
//    companion object {
//        var lastQuote: String = QuoteProvider.getRandomQuote()
//    }
    @SuppressLint("RestrictedApi", "ResourceType")
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        val quote = QuoteProvider.getQuoteOfDay()

        provideContent {
            Column(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .background(ColorProvider(Color(0xFffFF3E0)))
                    .padding(16.dp),
                verticalAlignment = Alignment.Vertical.CenterVertically,
                horizontalAlignment = Alignment.Horizontal.CenterHorizontally
            ) {
                Text(
                    text = "✨ Quote of the Day",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = ColorProvider(Color(0xFF333333))
                    )
                )

                Spacer(modifier = GlanceModifier.height(12.dp))

                Text(
                    text = "“$quote”",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Italic,
                        color = ColorProvider(Color(0xFF555555))
                    ),
                    maxLines = 4
                )

                Spacer(modifier = GlanceModifier.height(20.dp))


            }
        }
    }
}
