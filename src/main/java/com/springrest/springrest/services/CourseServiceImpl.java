package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
@Autowired
	
	private CourseDao courseDao;
//List<Course> list;

	public CourseServiceImpl() {
	
	// list = new ArrayList<>()
	//list.add(new Course(145,"JAVA","THIS COURSE CINTAINS BASIC OF JAVA");
		
    //List.add(new Course(145,"HTML","THIS COURSE CINTAINS BASIC OF HTML");
	
	
	}
	
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}







	@Override
	public Course getCourse(long courseId) 
	{
		// TODO Auto-generated method stub
		
		// Course c=null;
			//for(Course course:list)
			//{
			//	if(course.getId()==courseId)
				//{
				//	c=course;
				//	break;
				//}
			//}
			
				
			return courseDao.getOne(courseId);
		}







	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		//list.add(course);
		courseDao.save(course);
		
		return course;
	}







	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		//list.forEach(e -> {
			
		//	if(e.getId()==course.getId());
		//	{
		//	   e.setTitle(course.getTitle());
		//	   e.setDescription(course.getDescription());
				
				
	//	}
	//	});
	
	courseDao.save(course);
	
		
		
		
		return course;
	}







	@Override
	public void deleteCourse(long parseLong)
	{
		// TODO Auto-generated method stub
		//list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
		
		
		@SuppressWarnings("deprecation")
		Course entity= courseDao.getReferenceById(parseLong);
		courseDao.delete(entity);
		
	
		
		
	}

	

}
	
	
	
	
	
	
	
	
	
	
	

	

