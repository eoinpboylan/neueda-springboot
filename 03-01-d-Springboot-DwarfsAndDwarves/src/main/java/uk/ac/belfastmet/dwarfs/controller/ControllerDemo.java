	package uk.ac.belfastmet.dwarfs.controller;


	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/")


public class ControllerDemo {

		@GetMapping("/disneyrocks")
		public String disney(Model model) {
			return "Hello World!";
			
		}
		
		@GetMapping("/bingo")
		public static String bingo(Model model) {
			return "There was a dog in our back yard...";
		}
		
		@GetMapping("/princess")
		public static String princess(Model model) {
			return "Meghan Merkle";
		}
		
	}


