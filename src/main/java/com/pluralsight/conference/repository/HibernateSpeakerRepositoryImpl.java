package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        Speaker speaker = new Speaker("David", "Last Name");
        speaker.setSeedNum(seedNum);

        System.out.println("cal: " + cal.getTime());

        return List.of(speaker);
    }

}
