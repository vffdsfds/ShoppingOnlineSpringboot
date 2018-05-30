package onlineshopingThird;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import edu.mum.onlineshoping.controller.GuestController;
import edu.mum.onlineshoping.service.ProductService;

public class adminTest {
	@Mock
	private ProductService productService;
	
	@InjectMocks
	private GuestController guestController;
	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(guestController).build();
	}

	@Test
	public void testGuestController() throws Exception {
		mockMvc.perform(get("/guest/list/product")).andExpect(status().isOk());
	}


}
