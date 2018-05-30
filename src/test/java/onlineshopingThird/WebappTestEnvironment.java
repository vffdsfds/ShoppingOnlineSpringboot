/*package onlineshopingThird;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import onlineshopingThird.securityTest.MockSecurityContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class WebappTestEnvironment {
	 @Resource
	    private FilterChainProxy springSecurityFilterChain;

	    @Autowired
	    @Qualifier("databaseUserService")
	    protected UserDetailsService userDetailsService;

	    @Autowired
	    private WebApplicationContext wac;

	    @Autowired
	    protected DataSource dataSource;

	    protected MockMvc mockMvc;

	    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	    private Authentication authentication;

	    public static class MockSecurityContext implements SecurityContext {

	        private static final long serialVersionUID = -1386535243513362694L;

	        private Authentication authentication;

	        public MockSecurityContext(Authentication authentication) {
	            this.authentication = authentication;
	        }

	        @Override
	        public Authentication getAuthentication() {
	            return this.authentication;
	        }

	        @Override
	        public void setAuthentication(Authentication authentication) {
	            this.authentication = authentication;
	        }
	    }

	    protected UsernamePasswordAuthenticationToken getPrincipal(String username) {

	        UserDetails user = this.userDetailsService.loadUserByUsername(username);

	        UsernamePasswordAuthenticationToken authentication = 
	                new UsernamePasswordAuthenticationToken(
	                        user, 
	                        user.getPassword(), 
	                        user.getAuthorities());

	        return authentication;
	    }

	    @Before
	    public void setupMockMvc() throws NamingException {

	        // setup mock MVC
	        this.mockMvc = MockMvcBuilders
	                .webAppContextSetup(this.wac)
	                .addFilters(this.springSecurityFilterChain)
	                .build();
	    }
	    @Test
	    public void signedIn() throws Exception {

	        UsernamePasswordAuthenticationToken principal = 
	                this.getPrincipal("admin");

	        MockHttpSession session = new MockHttpSession();
	        session.setAttribute(
	                HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, 
	                new MockSecurityContext(principal));


	        super.mockMvc
	            .perform(
	                    get("/admin")
	                    .session(session))
	            .andExpect(status().isOk());
	    }
}
*/