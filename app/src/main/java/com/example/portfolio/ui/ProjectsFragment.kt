package com.example.portfolio.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.portfolio.R
import com.example.portfolio.adapter.ProjectAdapter
import com.example.portfolio.model.Project

class ProjectsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_projects, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.projectsRecyclerView)

        val projects = listOf(
            Project(
                name = "eCommerce",
                technologies = "Java, Spring Boot, Posgresql",
                link = "https://github.com/asanov-b/eCommerce"
            ),
            Project(
                name = "PhoneBook",
                technologies = "Java, Spring Boot, Posgresql",
                link = "https://github.com/asanov-b/PhoneBook"
            ),
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ProjectAdapter(projects)
    }
}
