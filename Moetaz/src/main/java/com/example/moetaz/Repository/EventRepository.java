package com.example.moetaz.Repository;

import com.example.moetaz.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
