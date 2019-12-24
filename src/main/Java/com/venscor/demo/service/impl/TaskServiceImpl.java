package com.venscor.demo.service.impl;

import com.venscor.demo.dao.TaskMapper;
import com.venscor.demo.entity.Task;
import com.venscor.demo.entity.TaskExample;
import com.venscor.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Venscor
 * @date: 2019/12/23
 * @description
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;

    @Override
    public List<Task> selectTasks(TaskExample taskExample) {
        return taskMapper.selectByExample(taskExample);
    }
}
