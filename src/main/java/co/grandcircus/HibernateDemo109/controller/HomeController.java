package co.grandcircus.HibernateDemo109.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.HibernateDemo109.dao.PersonRepo;
import co.grandcircus.HibernateDemo109.model.Person;

@Controller
public class HomeController {

	@Autowired
	PersonRepo p;

	@RequestMapping("/")
	public ModelAndView index() {
		List<Person> peeps = p.findAll();

		return new ModelAndView("index", "test", peeps);
	}

	@RequestMapping(value= {"/add-person", "/update-person"})
	public ModelAndView add(Person pDetails) {

		p.save(pDetails);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/update-form")
	public ModelAndView updateForm(Person person) {

		return new ModelAndView("update-form", "p", person);
	}
	
	@RequestMapping("delete")
	public ModelAndView removePerson(Person pDetails) {

		p.deleteById(pDetails.getId());
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("find-person") 
	public ModelAndView findPerson(String name) {
		return new ModelAndView("repo-test", "testing", p.findByName(name));
	}

}





