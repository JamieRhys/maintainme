package jre.maintainme.apptest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jre.maintainme.controllers.MainController;

@SpringBootTest
class MaintainmeApplicationTests {
	@Autowired private MainController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
