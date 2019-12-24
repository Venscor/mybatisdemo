package com.venscor.demo.controller;

import com.venscor.demo.entity.Task;
import com.venscor.demo.entity.TaskExample;
import com.venscor.demo.service.TaskService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Venscor
 * @date: 2019/12/23
 * @description
 */
@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("/rest/tasks")
    @GetMapping
    public String showTask() {
        TaskExample taskExample = new TaskExample();
        taskExample.getOrderByClauses().put("addr", "asc");
        taskExample.getOrderByClauses().put("age", "desc");
//        taskExample.setOrderByClause("addr asc,age desc");
        List<Task> tasks = taskService.selectTasks(taskExample);

        return JSONObject.valueToString(tasks);
    }
}
