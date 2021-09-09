package com.example.demo.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.onlineentity;
import com.example.demo.repo.onlinerepo;
import com.example.demo.ser.onlineservice;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OnlineController 
{
	@Autowired
	onlineservice serv;
	
	
	@GetMapping("/products")
	public List<onlineentity> getall() 
	{
	
		return serv.getall();
		}
	
    @GetMapping("/products/{aid}")
     public onlineentity getbyid(@PathVariable("aid") int aid) {
    		return serv.getbyid(aid);
    	}
    
    @PostMapping("/product")
    public String additems(@RequestBody onlineentity entity) {
    	 serv.additems(entity);
    	 return "Successfully inserted";
    	
    }
   
}  

