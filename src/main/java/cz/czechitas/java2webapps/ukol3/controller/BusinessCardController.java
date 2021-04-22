package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.BusinessCard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class BusinessCardController {

  private ArrayList<BusinessCard> businessCards = new ArrayList<>();

  public BusinessCardController(){
    businessCards.add(new BusinessCard("James Bond", "MI6", "85 Albert Embankment, Vauxhall", "London SE11 5AW", "james@bond.com", "+44 007 007 007", "www.007.com"));
    businessCards.add(new BusinessCard("Terje Haakonsen", "Freelancer snowboarder", "Vinjevegen 1429", "3890 Vinje", "terje@haakonsen.com", "+47 007 007 007", "www.terjehaakonsen.com"));
    businessCards.add(new BusinessCard("Alexander Van der Bellen", "Austria's president", "Hofburg, Ballhausplatz", "1010 Wien", null, "+43-(0)1/53422-318", "www.bundespraesident.at"));
    businessCards.add(new BusinessCard("Dubioza Kolektiv", "Band", "Baščaršija 1", "Sarajevo 71000", "dubioza@kolektiv.com", null,"https://dubioza.org/"));
  }

  @GetMapping("/")
  public ModelAndView list() {
    ModelAndView maw = new ModelAndView("seznam");
    maw.addObject("businessCards", businessCards);
    return maw;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView maw = new ModelAndView("detail");
    maw.addObject("bkDetail", businessCards.get(id));
    return maw;
  }
}
