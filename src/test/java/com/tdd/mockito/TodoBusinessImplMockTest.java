package com.tdd.mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;

import com.tdd.business.TodoBusinessImpl;
import com.tdd.data.api.TodoService;

@RunWith(MockitoJUnitRunner.class)
@PrepareForTest({TodoService.class})
public class TodoBusinessImplMockTest {
//	@Rule
//	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	TodoService mockTodoService;
	
	@InjectMocks
	TodoBusinessImpl todobusiness;
	
//	@Test
//	public void testReteriveTodoRelatedToSpringUsingMock() {
//		
//		List<String> todos = Arrays.asList("Testing Spring","Spring","working mode");
//		
//		when(mockTodoService.retrieveTodos(anyString())).thenReturn(todos);
//		
//		List<String> filteredTodos = todobusiness.retrieveTodosRelatedToSpring("dummy");
//		
//		assertEquals(2, filteredTodos.size());
//		
//	}
//	
//	@Test
//	public void testReteriveTodoRelatedToSpringUsingMock_asEmpty() {
//		
//		List<String> todos = Arrays.asList();
//		
//		when(mockTodoService.retrieveTodos("dummy")).thenReturn(todos);
//		
//		List<String> filteredTodos = todobusiness.retrieveTodosRelatedToSpring("dummy");
//		
//		assertEquals(0, filteredTodos.size());
//		
//	}
//	
//	@Test(expected=ArrayIndexOutOfBoundsException.class)
//	public void letsMocklist_throwException(){
//		List mocklist = mock(List.class);
//		
//		when(mocklist.get(anyInt())).thenThrow(new ArrayIndexOutOfBoundsException());
//		assertEquals("testing",mocklist.get(0));
//		
//		
//	}
	
	@Test
	public void spyTest(){
		List arraylist = spy(ArrayList.class);
		
		assertEquals(0,arraylist.size());
		arraylist.add("hello");
		verify(arraylist).add("hello");
		assertEquals(1,arraylist.size());
		
		verify(arraylist,never()).clear();
	}

}
