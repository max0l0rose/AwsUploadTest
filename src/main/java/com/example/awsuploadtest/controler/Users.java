package com.example.awsuploadtest.controler;

import com.example.awsuploadtest.model.Usr;
import com.example.awsuploadtest.repo.UsrRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Users {

	final UsrRepository usrRepository;

	@GetMapping("/{id}")
	@ResponseBody
	String getUsers(@PathVariable long id) {
		Usr usr = usrRepository.findById(id).get();
		return usr.toString();
	}

	@GetMapping("")
	@ResponseBody
	String getUsers2() {
		return "Kuku! )";
	}
}

