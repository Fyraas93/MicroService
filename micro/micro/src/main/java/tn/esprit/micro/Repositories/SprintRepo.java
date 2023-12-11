package tn.esprit.micro.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.micro.Entities.Sprint;

@Repository
public interface SprintRepo extends JpaRepository<Sprint,Long> {

    Sprint findSprintById(int Id);
}
