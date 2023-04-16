package org.cuong24.repository;

import org.cuong24.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
