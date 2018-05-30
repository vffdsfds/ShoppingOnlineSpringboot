package onlineshopingThird;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;
//import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import edu.mum.onlineshoping.OnlineShoppingApplication;
import edu.mum.onlineshoping.config.WebSecurityConfig;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={OnlineShoppingApplication.class, WebSecurityConfig.class})
@WebAppConfiguration


public class SpringApplicationTests {

    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;
    @Autowired
    private FilterChainProxy filterChainProxy;
    @Autowired 
    DataSource dataSource;
   

    @Before
    public void setUp() {
        mockMvc =  MockMvcBuilders.webAppContextSetup(context)
                .dispatchOptions(true)
                .addFilters(filterChainProxy)
                .build();
    }

    @Test
    public void testAnonymous() throws Exception {
        mockMvc.perform(get("/admin")).andExpect(status().is3xxRedirection());
    }

    @Test
    public void testUserAccessForAccount() throws Exception{
        mockMvc.perform(get("/admin")).andExpect(status().isOk());
        
        /*mockMvc.perform(get("/admin")
        	      .with(user("admin")))
        	      .andExpect(status().isOk());*/
    }

//    .perform(formLogin("/auth").user("admin").password("pass"))
}