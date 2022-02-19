package com.github.mifeng925.testplugin.services

import com.intellij.openapi.project.Project
import com.github.mifeng925.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
