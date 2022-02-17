package repository;

import classes.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RepoTeam implements ICrudRepo<Team>{

    private List<Team> repoList;

    public RepoTeam(){
        this.repoList = new ArrayList<>();
    }

    @Override
    public List<Team> findAll() {

        return this.repoList;
    }

    @Override
    public Team findOne(Long id) {


        for (Team team : this.repoList) {
            if (Objects.equals(team.getId(), id))
                return team;
        }
        return null;
    }


    @Override
    public Team save(Team obj) {
        if (this.findOne(obj.getId()) != null)
            return obj;

        this.repoList.add(obj);
        return null;
    }

    @Override
    public Team update(Team obj)  {

        for(Team bestellung: this.repoList){
            if(Objects.equals(bestellung.getId(), obj.getId())){
                bestellung.setId(obj.getId());
                bestellung.setName(obj.getName());
                bestellung.setMitarbeiters(obj.getMitarbeiters());

                return null;
            }
        }

        return obj;
    }


    @Override
    public Team delete(Long id) {

        if (this.findOne(id) == null)
            return null;

        Team toDelete = this.findOne(id);
        this.repoList.remove(toDelete);
        return toDelete;
    }

}
