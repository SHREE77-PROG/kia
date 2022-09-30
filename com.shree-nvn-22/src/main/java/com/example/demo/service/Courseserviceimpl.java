package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Course;

public class Courseserviceimpl implements Courseservice {

	List<Course>list;
		public Courseserviceimpl() { 
			list=new ArrayList(); 
			list.add(new Course(145,"jdhfg","otuirh"));
			list.add(new Course(425,"gdteg","hyasrw"));
				
		
	}
		@Override
		public List<Course> getcourse() {
			// TODO Auto-generated method stub
			return list;
		}
	
		
	}

