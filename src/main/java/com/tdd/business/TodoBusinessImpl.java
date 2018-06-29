package com.tdd.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tdd.data.api.TodoService;
// todobusinessimpl SUT - System Under Test
// todoservice - dependency.
public class TodoBusinessImpl {
	public TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> allTodos = Arrays.asList("Testing Spring","Spring","working mode");
		for (String todo : allTodos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}
}
