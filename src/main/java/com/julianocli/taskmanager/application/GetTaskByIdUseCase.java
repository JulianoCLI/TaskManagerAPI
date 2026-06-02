package com.julianocli.taskmanager.application;

import com.julianocli.taskmanager.application.output.TaskOutput;
import com.julianocli.taskmanager.domain.TaskId;
import com.julianocli.taskmanager.domain.TaskNotFoundException;
import com.julianocli.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class GetTaskByIdUseCase {
    private final TaskRepository repository;

    public GetTaskByIdUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(TaskId id) {
        return repository.findById(id)
                .map(TaskOutput::from)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }
}
