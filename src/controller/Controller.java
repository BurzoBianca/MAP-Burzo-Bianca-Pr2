package controller;

import classes.*;
import repository.*;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {

    private RepoMitarbeiter repoMitarbeiter;
    private RepoTeam repoTeam;

    public Controller(RepoMitarbeiter repoMitarbeiter, RepoTeam repoTeam) {
        this.repoMitarbeiter = repoMitarbeiter;
        this.repoTeam = repoTeam;
    }

    public Mitarbeiter addMitarbeiter(Mitarbeiter obj){
        return this.repoMitarbeiter.save(obj);
    }

    public Mitarbeiter deleteMitarbeiter(Long id){
        return this.repoMitarbeiter.delete(id);
    }

    public void updateMitarbeiter(Mitarbeiter obj){
        this.repoMitarbeiter.update(obj);
    }

    public Team addTeam(Team obj){
        return this.repoTeam.save(obj);
    }

    public Team deleteTeam(Long id){
        return this.repoTeam.delete(id);
    }

    public Team updateTeam(Team obj){
        return this.repoTeam.update(obj);
    }

    private Mitarbeiter findMitarbeiter(Long id){
        return this.repoMitarbeiter.findOne(id);
    }

    public List<Team> filterTeamBYMitarbeiter(Long id){
        return this.repoTeam.findAll()
                .stream()
                .filter(mitarbeiter -> mitarbeiter.getMitarbeiters().contains(this.findMitarbeiter(id)))
                .collect(Collectors.toList());
    }

}
