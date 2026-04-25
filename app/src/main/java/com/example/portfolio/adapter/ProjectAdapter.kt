package com.example.portfolio.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio.R
import com.example.portfolio.model.Project

class ProjectAdapter(private val items: List<Project>) : RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_project, parent, false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val project = items[position]
        holder.nameText.text = project.name
        holder.techText.text = project.technologies
        holder.linkText.text = project.link

        holder.openButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(project.link))
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = items.size

    class ProjectViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameText: TextView = view.findViewById(R.id.projectName)
        val techText: TextView = view.findViewById(R.id.projectTech)
        val linkText: TextView = view.findViewById(R.id.projectLink)
        val openButton: Button = view.findViewById(R.id.openLinkButton)
    }
}
