package com.venscor.demo.service;

import com.venscor.demo.entity.Task;
import com.venscor.demo.entity.TaskExample;

import java.util.List;

public interface TaskService {
    List<Task> selectTasks(TaskExample taskExample);
}
