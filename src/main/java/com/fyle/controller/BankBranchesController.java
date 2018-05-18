package com.fyle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fyle.exception.ResourceNotFoundException;
import com.fyle.model.BankBranches;
import com.fyle.repository.BankBranchesRepository;

@RestController
@RequestMapping("/api")
public class BankBranchesController {

    @Autowired
    BankBranchesRepository bankBranchesRepository;
    
    // Get a Single Bank
    @GetMapping("/indianbanks/{ifsc}")
    public BankBranches getBankBranchByIfsc(@PathVariable(value = "ifsc") String noteId) {
    	
        return bankBranchesRepository.findByifsc(noteId)
                .orElseThrow(() -> new ResourceNotFoundException("BankBranches", "ifsc", noteId));
    }
    
    // Get a Multiple Bank
    @GetMapping("/indianbankslist/{name}/{city}")
    public List<BankBranches> getByCityAndName(@PathVariable(value = "name") String name, @PathVariable(value = "city") String city) {
    	
        return bankBranchesRepository.findByCityAndName(name.toUpperCase(),city.toUpperCase() );
                //.orElseThrow(() -> new ResourceNotFoundException("BankBranches", "name", name));
    }

}
