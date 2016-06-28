package net.xeric.demos.controllers;

import net.xeric.demos.services.AdderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by markshead on 3/30/16.
 */
@RestController
public class AdderController {
    @Autowired
    AdderService adderService;

    @RequestMapping("/adder")
        public int adder(@RequestParam(value="firstNumber", defaultValue="0") int firstNumber, @RequestParam(value="secondNumber", defaultValue="0") int secondNumber) {
            return adderService.add(firstNumber, secondNumber);
        }



}
