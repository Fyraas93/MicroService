package tn.esprit.micro.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.micro.Repositories.SprintRepo;
import tn.esprit.micro.Entities.Sprint; // Importer la classe Sprint

import java.util.List;

@Service
@AllArgsConstructor
public class SprintServiceImp implements ISprintService { // Renommer FoyerServiceImpl en SprintServiceImpl
    private final SprintRepo sprintRepo; // Renommer FoyerRepo en SprintRepo

    @Override
    public List<Sprint> retrieveAllSprints() {
        return sprintRepo.findAll();
    }

    @Override
    public Sprint addSprint(Sprint s) {
        return sprintRepo.save(s);
    }

    @Override
    public Sprint updateSprint(Sprint s) {
        return sprintRepo.save(s);
    }

    @Override
    public Sprint retrieveSprint(long idSprint) {
        return sprintRepo.findById(idSprint).orElse(null);
    }

    @Override
    public void removeSprint(long idSprint) {
        sprintRepo.deleteById(idSprint);
    }
}
