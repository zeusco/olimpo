package com.olimpo.zeusco.olimpo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

interface PersonService {
	Page<Person> listAllByPage(Pageable pageable);
}
