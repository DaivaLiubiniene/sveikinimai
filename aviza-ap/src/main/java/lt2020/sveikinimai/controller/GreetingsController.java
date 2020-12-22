package lt2020.sveikinimai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lt2020.sveikinimai.model.Greeting;
import lt2020.sveikinimai.repository.GreetingRepository;
import lt2020.sveikinimai.repository.LocationRepository;

@Controller
@CrossOrigin(origins = { "http://localhost:3000" })
@RequestMapping(path = "/greetings")
public class GreetingsController {
	@Autowired
	private LocationRepository locationRepository;

	@Autowired
	private GreetingRepository greetingRepository;

	@PostMapping(path = "/add")
	public @ResponseBody String add(@RequestParam String text, @RequestParam String image,
			@RequestParam(required = false) String audioFile, @RequestParam String greeterFirstName,
			@RequestParam String greeterLastName, @RequestParam Integer locationId) {

		Greeting g = new Greeting();
		g.setText(text);
		g.setImage(image);
		g.setAudioFile(audioFile);
		g.setGreeterFirstName(greeterFirstName);
		g.setGreeterLastName(greeterLastName);

		g.setLocation(locationRepository.findById(locationId).get());

		greetingRepository.save(g);

		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Greeting> getAll() {

		return greetingRepository.findAll();
	}
}