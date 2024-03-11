package ru.neoflex.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class PracticeApplicationMockMvcTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void plus_test() throws Exception {
		this.mockMvc
				.perform(get("/plus/5/3"))
				.andDo(print())
				.andExpect(content().string("8"))
				.andExpect(status().isOk());
	}

	@Test
	public void minus_test() throws Exception {
		this.mockMvc
				.perform(get("/minus/1/3"))
				.andDo(print())
				.andExpect(content().string("-2"))
				.andExpect(status().isOk());
	}

}
