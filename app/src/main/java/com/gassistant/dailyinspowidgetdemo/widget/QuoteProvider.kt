package com.gassistant.dailyinspowidgetdemo.widget

import android.icu.util.Calendar

object QuoteProvider {


    private val quotes = listOf(
        "Believe you can and you're halfway there.",
        "Don’t watch the clock; do what it does. Keep going.",
        "The future depends on what you do today.",
        "Don’t let yesterday take up too much of today.",
        "You are never too old to set another goal.",
        "Everything you can imagine is real.",
        "Push yourself, because no one else is going to do it for you.",
        "Success doesn’t just find you. You have to go out and get it.",
        "Great things never come from comfort zones.",
        "Dream it. Wish it. Do it.",
        "Stay foolish to stay sane.",
        "When nothing goes right, go left.",
        "Try Again. Fail again. Fail better.",
        "Don’t wait for opportunity. Create it.",
        "Once you choose hope, anything’s possible.",
        "If you want it, work for it.",
        "Action is the foundational key to all success.",
        "You are stronger than you think.",
        "Do something today your future self will thank you for.",
        "Don’t tell people your plans. Show them your results.",
        "Wake up with determination. Go to bed with satisfaction.",
        "Doubt kills more dreams than failure ever will.",
        "Little things make big days.",
        "It always seems impossible until it’s done.",
        "Stay patient and trust your journey.",
        "Difficult roads often lead to beautiful destinations.",
        "Make each day your masterpiece.",
        "Act as if what you do makes a difference. It does.",
        "Big journeys begin with small steps.",
        "One day or day one. You decide."
    )

    fun getQuoteOfDay(): String {
        val dayofYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        return quotes[dayofYear % quotes.size] }

}