package com.state.State.Entity;

import com.sun.istack.NotNull;
import org.springframework.http.ResponseEntity;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StateDto {
    @NotNull
    private long id;
    @NotBlank (message = "O campo 'name' deve ser informado")
    private String name;
    @NotBlank (message = "O campo 'region' deve ser informado")
    private String region;
    @NotNull
    private Integer population;
    @NotBlank (message = "O campo 'capital' deve ser informado")
    private String capital;
    @NotNull
    private Integer area;

    public StateDto(ResponseEntity<StateDto> updatedState) {
    }

    public StateDto(long id, String name, String region, String population, String capital, Integer area) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.population = Integer.valueOf(population);
        this.capital = capital;
        this.area = Integer.valueOf(String.valueOf(area));
    }

    public StateDto(State stateDto) {
        this.id = stateDto.getId();
        this.name = stateDto.getName();
        this.region = stateDto.getRegion();
        this.population = stateDto.getPopulation();
        this.capital = stateDto.getCapital();
        this.area = Integer.valueOf(stateDto.getArea());
    }
    public static List<StateDto> toConvert(Optional<State> state){
        return state.stream().map(StateDto::new).collect(Collectors.toList());
    }
    public static List<StateDto> toConvertToList(List<State> state){
        return state.stream().map(StateDto::new).collect(Collectors.toList());
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
        this.area = area;
    }
}
