package cz.vsb.zelenak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/hello")
	String greeting() {
		return "<b>Ahoj worlde!</b>";
	}
}
