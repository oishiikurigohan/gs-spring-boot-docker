package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
public class HelloWorldController {
	
	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("message", "こんにちは！");
		return "index";
	}
	
	@PostMapping("/")
	public String nameToMessage(@RequestParam("name") String name, Model model) {
		model.addAttribute("message", "こんにちは" + name + "さん！");
		return "index";
	}
}

