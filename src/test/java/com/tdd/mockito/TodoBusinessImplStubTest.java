package com.tdd.mockito;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tdd.business.TodoBusinessImpl;
import com.tdd.data.api.TodoService;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoservicestub = new TodoServiceStub();
		TodoBusinessImpl todobusiness = new TodoBusinessImpl(todoservicestub);
		List<String> filteredTodos = todobusiness.retrieveTodosRelatedToSpring("test");
		
		assertEquals(2, filteredTodos.size());
		assertEquals(Arrays.asList("Testing Spring","Spring"),filteredTodos);
		
	}

}
