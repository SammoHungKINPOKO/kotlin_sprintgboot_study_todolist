package com.example.todolist

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class TaskCreateForm {

    @NotBlank(message = "ちゃんと書けよバカ")
    @Size(max = 20, message = "手短に書けクソバカ")
    var content: String? = null

}