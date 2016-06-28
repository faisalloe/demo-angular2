package net.xeric.demos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.xeric.demos.services.RomanNumberService;


@RestController
public class RomanNumberController {
    
	@Autowired
    RomanNumberService romanNumberService;
    
	
    @RequestMapping("/romanNumber")
    public @ResponseBody String toRomanNum(@RequestParam(value="num", defaultValue="0") int num){
    
    	return romanNumberService.toRoman(num);

    }
    
}
