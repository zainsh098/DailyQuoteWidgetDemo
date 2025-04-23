package com.gassistant.dailyinspowidgetdemo.widget

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.action.ActionParameters
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.updateAll

// Created by Zain Shakoor
// on 4/23/2025

class RefreshQuoteAction :ActionCallback {
    override suspend fun onAction(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
QuoteWidget().updateAll(context)    }
}