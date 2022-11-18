package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        Speaker speaker = new Speaker("David", "Last Name");

        return List.of(speaker);
    }

}
