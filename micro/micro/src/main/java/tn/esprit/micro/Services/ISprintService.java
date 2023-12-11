package tn.esprit.micro.Services; // Changer le nom du package en micro

import tn.esprit.micro.Entities.Sprint; // Importer la classe Sprint

import java.util.List;

public interface ISprintService { // Changer IFoyerService en ISprintService

    List<Sprint> retrieveAllSprints(); // Changer retrieveAllFoyers en retrieveAllSprints

    Sprint addSprint(Sprint s); // Changer addFoyer en addSprint

    Sprint updateSprint(Sprint s); // Changer updateFoyer en updateSprint

    Sprint retrieveSprint(long idSprint); // Changer retrieveFoyer en retrieveSprint

    void removeSprint(long idSprint); // Changer removeFoyer en removeSprint
}
