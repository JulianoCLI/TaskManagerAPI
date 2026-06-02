package com.julianocli.taskmanager.infrastructure.http.request;

import com.julianocli.taskmanager.application.input.UpdateTaskInput;
import com.julianocli.taskmanager.domain.TaskStatus;

import java.util.Optional;

public record UpdateTaskRequest (
        Optional<String> title,
        Optional<String> description,
        Optional<String> status
){
    public UpdateTaskInput toInput(){
            return new UpdateTaskInput(title, description, status.map(TaskStatus::valueOf));
    }
}
