package com.julianocli.taskmanager.application;

import com.julianocli.taskmanager.application.input.CreateTaskInput;
import com.julianocli.taskmanager.application.output.TaskOutput;
import com.julianocli.taskmanager.domain.Task;
import com.julianocli.taskmanager.domain.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase {
    private final TaskRepository repository;

    public CreateTaskUseCase(TaskRepository repository) {
        this.repository = repository;
    }

    public TaskOutput execute(CreateTaskInput input) {
        var task = new Task(input.title(),  input.description());
        var saved = repository.save(task);
        return TaskOutput.from(task);
    }
}
