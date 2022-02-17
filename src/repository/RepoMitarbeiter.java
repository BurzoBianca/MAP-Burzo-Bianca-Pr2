package repository;

import classes.Mitarbeiter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RepoMitarbeiter implements ICrudRepo<Mitarbeiter> {

    private List<Mitarbeiter> repoList;

    public RepoMitarbeiter(){
        this.repoList = new ArrayList<>();
    }


    @Override
    public List<Mitarbeiter> findAll() {

        return this.repoList;
    }

    @Override
    public Mitarbeiter findOne(Long id) {


        for (Mitarbeiter mitarbeiter : this.repoList) {
            if (Objects.equals(mitarbeiter.getId(), id))
                return mitarbeiter;
        }
        return null;
    }

    @Override
    public Mitarbeiter save(Mitarbeiter obj) {

        if (this.findOne(obj.getId()) != null)
            return obj;

        this.repoList.add(obj);
        return null;
    }

    @Override
    public Mitarbeiter update(Mitarbeiter obj)  {

        for(Mitarbeiter mitarbeiter: this.repoList){
            if(Objects.equals(mitarbeiter.getId(), obj.getId())){
                mitarbeiter.setLohn((int) obj.getLohn());
                return null;
            }
        }

        return obj;
    }


    @Override
    public Mitarbeiter delete(Long id) {

        if (this.findOne(id) == null)
            return null;

        Mitarbeiter toDelete = this.findOne(id);
        this.repoList.remove(toDelete);
        return toDelete;
    }
}
