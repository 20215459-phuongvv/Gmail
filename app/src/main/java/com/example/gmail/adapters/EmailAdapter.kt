package com.example.gmail.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.R
import com.example.gmail.models.Email

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val senderImage: TextView = view.findViewById(R.id.senderImage)
        val senderName: TextView = view.findViewById(R.id.senderName)
        val emailContent: TextView = view.findViewById(R.id.emailContent)
        val emailTime: TextView = view.findViewById(R.id.emailTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.senderImage.text = email.senderInitial
        holder.senderName.text = email.senderName
        holder.emailContent.text = email.contentPreview
        holder.emailTime.text = email.time
    }

    override fun getItemCount() = emailList.size
}
