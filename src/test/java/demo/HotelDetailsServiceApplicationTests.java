package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hotel.demo.HotelDetailsServiceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HotelDetailsServiceApplication.class)
@WebAppConfiguration
public class HotelDetailsServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
