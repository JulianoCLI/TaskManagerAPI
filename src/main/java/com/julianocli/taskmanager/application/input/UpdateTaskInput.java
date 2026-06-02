package com.julianocli.taskmanager.application.input;

import com.julianocli.taskmanager.domain.TaskStatus;

import java.util.Optional;

public record UpdateTaskInput(Optional<String> title, Optional<String> description, Optional<TaskStatus> status) {
}
