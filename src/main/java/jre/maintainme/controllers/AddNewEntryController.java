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
public class AddNewEntryController {
    @Autowired EntryPCRepository entryPCRepo;

    public AddNewEntryController(EntryPCRepository entryPCRepo) {
        this.entryPCRepo = entryPCRepo;
    }

    @RequestMapping(value = "/maintainme/submit/hardware/pc", method = RequestMethod.POST)
    public String submitEntryPC(@Valid @ModelAttribute("entryPC") EntryPC entry, BindingResult result, Model model) {
        entry.printDetails();

        entryPCRepo.save(entry);

        return "submit";
    }
}
