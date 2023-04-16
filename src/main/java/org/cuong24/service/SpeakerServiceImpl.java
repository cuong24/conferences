package org.cuong24.service;

import org.cuong24.model.Speaker;
import org.cuong24.repository.HibernateSpeakerRepositoryImpl;
import org.cuong24.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerRepository getRepository() {
        return repository;
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

}
