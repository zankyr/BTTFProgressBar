package com.github.zankyr.bttfprogressbar.services

import com.github.zankyr.bttfprogressbar.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
