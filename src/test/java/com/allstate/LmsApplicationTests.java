package com.allstate;

import com.allstate.services.KlassServicesTest;
import com.allstate.services.StudentServicesTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Suite.class)
@SpringBootTest
@Suite.SuiteClasses({
		StudentServicesTest.class,
		KlassServicesTest.class
})
public class LmsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
