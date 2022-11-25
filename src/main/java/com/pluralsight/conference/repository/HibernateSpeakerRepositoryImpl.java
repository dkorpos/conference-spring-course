package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        Speaker speaker = new Speaker("David", "Last Name");

        return List.of(speaker);
    }

}
