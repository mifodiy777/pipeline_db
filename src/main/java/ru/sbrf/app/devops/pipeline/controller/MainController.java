package ru.sbrf.app.devops.pipeline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.sbrf.app.devops.pipeline.dao.SubsystemDAO;
import ru.sbrf.app.devops.pipeline.entity.Subsystem;

@Controller    // This means that this class is a Controller
@RequestMapping(path = "/db/subsystem") // This means URL's start with /demo (after Application path)
public class MainController {

    @Autowired
    private SubsystemDAO subsystemDAO;

    @GetMapping(path = "/add")
    public @ResponseBody
    String addSubsystem(String name) {
        subsystemDAO.save(new Subsystem(name));
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Subsystem> getAllSubsystem() {
        return subsystemDAO.findAll();
    }
}
