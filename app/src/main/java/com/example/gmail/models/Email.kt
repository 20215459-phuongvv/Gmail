package com.example.gmail.models;

data class Email(
    val senderInitial: String,
    val senderName: String,
    val subject: String,
    val contentPreview: String,
    val time: String
)

