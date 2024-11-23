package com.magadhUniversity.service;



import com.magadhUniversity.model.Sport;
import com.magadhUniversity.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportService {
    @Autowired
    private SportRepository studentRepository;

    public void saveStudent(Sport sport) {
        studentRepository.save(sport);
}
}