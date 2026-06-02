package com.julianocli.taskmanager.application.output;

import com.julianocli.taskmanager.domain.Task;

import java.util.Optional;

public record TaskOutput(String id, String title, Optional<String> description, String status) {

    public static TaskOutput from(Task task) {
        return new  TaskOutput(task.getId().id().toString(),
            task.getTitle(),
            task.getDescription(),
            task.getStatus().name());
    }
}
