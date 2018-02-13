package com.olimpo.zeusco.olimpo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class PersonServiceImpl implements PersonService {

	final PersonRepository personRepository;
	
	@Autowired
	PersonServiceImpl(PersonRepository personRepository){
		this.personRepository = personRepository;
	}
	
	@Override
	 public Page<Person> listAllByPage(Pageable pageable) {
		 return personRepository.findAll(pageable);
	}
}
