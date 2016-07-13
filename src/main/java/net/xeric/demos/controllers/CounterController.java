package net.xeric.demos.controllers;

import net.xeric.demos.services.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markshead on 3/29/16.
 */
@RestController
public class CounterController {

    @Autowired
    CounterService counterService;
    @RequestMapping("/counter")
    public @ResponseBody int count() {
        return counterService.increment();
    }
}
