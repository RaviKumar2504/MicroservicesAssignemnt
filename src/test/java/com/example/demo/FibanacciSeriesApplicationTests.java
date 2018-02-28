package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.ws.rs.core.MediaType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controller.AssignemntsService;
import com.example.demo.controller.FibanacciCntrlr;

@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest(FibanacciCntrlr.class)
public class FibanacciSeriesApplicationTests {

	/*@Autowired
    private MockMvc mvc;*/

    @MockBean
    private AssignemntsService assignemntsService;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testFib() {
		
		OngoingStubbing<Integer> value = Mockito.when(assignemntsService.getFibSEries(10.0)).thenReturn(55);
		//assertEquals(value, 550);
	}
	
}
