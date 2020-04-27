package cz.tul.beran.weather.controller;

import cz.tul.beran.weather.entity.Country;
import cz.tul.beran.weather.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

  @Autowired
  private CountryRepository countryRepository;

  @RequestMapping(path = "", method = RequestMethod.GET)
  public String index(Model model) {
    model.addAttribute("countries", countryRepository.findAll());
    return "ahoj";
  }
}