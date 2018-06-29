package com.tdd.mockito;

import java.util.Arrays;
import java.util.List;

import com.tdd.data.api.TodoService;

public class TodoServiceStub implements TodoService {

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Testing Spring","Spring","working mode");
	}

}
