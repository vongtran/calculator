package user.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CalculatorLogController {

	@PostMapping(path = "/logCalculator")
	public void logCalculator(@RequestBody String log) {
		System.out.println(log);
	}
}
