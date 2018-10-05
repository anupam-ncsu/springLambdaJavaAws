package com.anupam.springlambda.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anupam.springlambda.model.Color;

@RestController
public class BasicController {
	
	@RequestMapping(value="/getcolor", method = RequestMethod.GET)
	public List<Color> GetSomething(){
		return Arrays.asList(
				new Color("Violet"),
				new Color("Indigo"),
				new Color("Blue"),
				new Color("Green"),
				new Color("Yellow"),
				new Color("Orange"),
				new Color("Red")
				);
	}
}
