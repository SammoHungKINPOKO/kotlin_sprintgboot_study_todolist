package com.example.todolist

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class TaskUpdateForm {

    @NotBlank
    @Size(max = 20, message = "20文字以内で入力しろカス")
    var content: String? = null

    var done: Boolean = false
}