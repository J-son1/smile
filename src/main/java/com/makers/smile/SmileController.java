package com.makers.smile;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmileController {
    @Autowired
    private SmileRepository smileRepository;
    
    @PostMapping("/api/smiles")
    public Smile create(@RequestBody SmileDTO smileDto) {
        Smile smile = new Smile();
        BeanUtils.copyProperties(smileDto, smile);
        return smileRepository.save(smile);
    } 
}
