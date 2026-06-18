package com.sit.example.layer4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.example.layer2.Tea;
import com.sit.example.layer3.TeaRepository;

@Service
public class BreakFastService {

	@Autowired
	TeaRepository teaRepo;
	
	public BreakFastService() {
		System.out.println("BreakfastService()...");
	}
	
	public List<Tea> selectAllTeas() {
		List<Tea> teaList = new ArrayList<Tea>(); //empty
		
		Iterable<Tea> iterable = teaRepo.findAll(); //select * from tea_info;
		
		Iterator<Tea> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Tea theTea = iterator.next();
			teaList.add(theTea);
		}
		return teaList;
	
	}
	
	public Tea insertTea(Tea newTea) {
		Optional<Tea> teaFoundBox =
				teaRepo.findById(newTea.getTeaId());
		if(teaFoundBox.isPresent()) {
			throw new TeaAlreadyExistsException("Tea already present");
		}
		else {
			teaRepo.save(newTea);
		}
		return newTea;
	}
	
	public class TeaAlreadyExistsException extends RuntimeException
	{
	public TeaAlreadyExistsException(String str) {
		super(str);
	}
}
}