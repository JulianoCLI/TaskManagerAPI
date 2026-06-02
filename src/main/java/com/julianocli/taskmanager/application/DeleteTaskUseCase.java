package com.julianocli.taskmanager.application;

import com.julianocli.taskmanager.domain.TaskId;
import com.julianocli.taskmanager.domain.TaskNotFoundException;
import com.julianocli.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteTaskUseCase {
    private final TaskRepository repository;

    public DeleteTaskUseCase(TaskRepository taskRepository) {
        this.repository = taskRepository;
    }

    public void execute(TaskId taskId) {
        if (repository.findById(taskId).isEmpty()) {
            throw new TaskNotFoundException(taskId);
        }

        repository.delete(taskId);
    }
}
