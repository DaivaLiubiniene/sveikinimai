package lt2020.sveikinimai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lt2020.sveikinimai.model.Location;
import lt2020.sveikinimai.repository.LocationRepository;

@Controller
@CrossOrigin(origins = { "http://localhost:3000" })
@RequestMapping(path = "/locations")
public class LocationController {
	@Autowired
	private LocationRepository locationRepository;

	@PostMapping(path = "/add")
	public @ResponseBody String add(@RequestParam String title, @RequestParam String logo) {

		Location l = new Location();
		l.setTitle(title);
		l.setLogo(logo);

		locationRepository.save(l);

		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Location> getAll() {

		return locationRepository.findAll();
	}
}