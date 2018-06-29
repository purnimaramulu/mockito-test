package com.tdd.mockito.powermock;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;



@RunWith(PowerMockRunner.class)
@PrepareForTest(UtilityClass.class)
public class PowerMockitoMockingStaticMethodTest {
	
	@Mock
	Dependency dependencyMock;

	@InjectMocks
	SystemUnderTest systemUnderTest;
	
	@Test
	public void test() {
		
		when(dependencyMock.retrieveAllStats()).thenReturn(
				Arrays.asList(1, 2, 3));
		
		PowerMockito.mockStatic(UtilityClass.class);
		
		when(UtilityClass.staticMethod(anyLong())).thenReturn(150); 
		
		assertEquals(150, systemUnderTest.methodCallingAStaticMethod());
		
		
		
	}

}
