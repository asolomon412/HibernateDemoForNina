package co.grandcircus.HibernateDemo109.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.HibernateDemo109.dao.PersonDao;
import co.grandcircus.HibernateDemo109.model.Person;

@Controller
public class HomeController {

	@Autowired
	PersonDao p;

	@RequestMapping("/")
	public ModelAndView index() {
		List<Person> peeps = p.findAll();

		return new ModelAndView("index", "test", peeps);
	}

	@RequestMapping(value= {"/add-person", "/update-person"})
	public ModelAndView add(Person pDetails) {

		p.addOrUpdate(pDetails);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/update-form")
	public ModelAndView updateForm(Person p) {

		return new ModelAndView("update-form", "p", p);
	}
	


}





