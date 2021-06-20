package com.thefreedevelopers.spring_mvc_tutorial.service;

import com.thefreedevelopers.spring_mvc_tutorial.entity.Category;
import com.thefreedevelopers.spring_mvc_tutorial.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    //Initialize CategoryRepository
    private CategoryRepository repository;

    //Get all categories
    public List<Category> getCategories(){
        return repository.findAll();
    }
}