package org.cuong24.repository;

import org.cuong24.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Cuong");
        speaker.setLastName("Nguyen");

        speakers.add(speaker);

        return speakers;
    }

}
