package com.pluralsight.conference.service;

import com.pluralsight.conference.model.Speaker;
import com.pluralsight.conference.repository.SpeakerRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("in constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("in initialize()");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
