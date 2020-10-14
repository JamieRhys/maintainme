package jre.maintainme.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jre.maintainme.entities.hardware.EntryPC;
import jre.maintainme.repositories.EntryPCRepository;

@RestController
public class MainController {
    @Autowired EntryPCRepository entryPCRepo;

    @RequestMapping("/pc")
    public Iterable<EntryPC> getPCs() {
        return entryPCRepo.findAll();
    }
}
