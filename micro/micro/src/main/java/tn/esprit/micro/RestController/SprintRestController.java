package tn.esprit.micro.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro.Services.ISprintService;
import tn.esprit.micro.Entities.Sprint;

import java.util.List;

@RequestMapping("/sprint")
@RestController
@AllArgsConstructor
public class SprintRestController {
    private final ISprintService iSprintService;


    @GetMapping("/afficher")
    List<Sprint> retrieveAllSprints()
    {
        return iSprintService.retrieveAllSprints();
    }

    @PostMapping("/ajouter")
    Sprint addSprint(@RequestBody Sprint s)
    {
        return iSprintService.addSprint(s);
    }

    @PutMapping("/modifier")
    Sprint updateSprint(@RequestBody Sprint s)
    {
        return iSprintService.updateSprint(s);
    }

    @GetMapping("/afficher_un_sprint/{idSprint}")
    Sprint retrieveSprint(@PathVariable("idSprint") long idSprint)
    {
        return iSprintService.retrieveSprint(idSprint);
    }

    @DeleteMapping("/supprimer_un_sprint/{id}")
    void removeSprint(@PathVariable("id") long idSprint)
    {
        iSprintService.removeSprint(idSprint);
    }


}
