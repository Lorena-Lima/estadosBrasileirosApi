package com.state.State.Entity;

import javax.persistence.*;

@Entity(name = "estados")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "nome")
    private String name;
    @Column (name = "região")
    private String region;
    @Column (name = "população")
    private Integer population;
    @Column (name = "capital")
    private String capital;
    @Column (name = "area")
    private Integer area;

    public State (){

    }
    public State(long id, String name, String region, String population, String capital, String area) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.population = Integer.valueOf(population);
        this.capital = capital;
        this.area = Integer.valueOf(area);
    }
    public State (StateDto state){ //quando eu receber um stateDto lá na minha requisição, ele me devolverá um state
        this.id = state.getId();
        this.name = state.getName();
        this.region = state.getRegion();
        this.population = state.getPopulation();
        this.capital = state.getCapital();
        this.area = Integer.valueOf(String.valueOf(state.getArea()));

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public Integer getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public Integer getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setArea(Integer area) {
        this.area = Integer.valueOf(String.valueOf(area));
    }
}
