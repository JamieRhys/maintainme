package jre.maintainme.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jre.maintainme.entities.hardware.EntryPC;
import jre.maintainme.repositories.EntryPCRepository;

@Controller
public class MainController {
    @Autowired EntryPCRepository entryPCRepo;


    public MainController(EntryPCRepository entryPCRepo) {
        this.entryPCRepo = entryPCRepo;
    }

    @RequestMapping(value = {"/", "maintainme"}, method = RequestMethod.GET)
    public String showFullList(Model model) {
        model.addAttribute("entryPC", new EntryPC());
        model.addAttribute("listPC", entryPCRepo.findAll());
        return "maintainme";
    }

    @RequestMapping(value = "/maintainme/submit", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("entryPC") EntryPC entry, BindingResult result, Model model) {
        System.out.println(result.getModel().values());
        entry.printDetails();

        entryPCRepo.save(entry);
        return "maintainme";
    }
}
