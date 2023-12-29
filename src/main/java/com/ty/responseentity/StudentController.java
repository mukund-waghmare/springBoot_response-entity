package com.ty.responseentity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/getbyId/{id}")
	public ResponseEntity<ResponseStucture<Student>> getById(@PathVariable int id)
	{
		if(id==1)
		{
			ResponseStucture<Student> resp=new ResponseStucture<Student>();
			resp.setMessage("success");
			resp.setStatusCode(200);
			
			Student student= new Student();
			student.setStudenId(1);
			student.setStudentName("ABC");
			student.setStudentMarks(98.80);
			resp.setData(student);
			
			return new ResponseEntity<ResponseStucture<Student>>(resp,HttpStatus.OK);
			
		}
		else 
		{
			ResponseStucture<Student> resp=new ResponseStucture<Student>();
			resp.setMessage("Id Not Found");
			resp.setStatusCode(404);
			Student student= new Student();
			student=null;
			resp.setData(student);
			
			return new ResponseEntity<ResponseStucture<Student>>(resp,HttpStatus.NOT_FOUND);
		}
		

	}

}
