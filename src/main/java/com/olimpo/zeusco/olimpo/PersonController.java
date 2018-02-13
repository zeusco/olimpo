package com.olimpo.zeusco.olimpo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonController {
	
	PersonService personService;
	
	@Autowired
	PersonController( PersonService personService ){
		this.personService = personService;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	Page<Person> list( Pageable pageable){
		//Person persons;
		return personService.listAllByPage(pageable);
		//persons
	} 
}