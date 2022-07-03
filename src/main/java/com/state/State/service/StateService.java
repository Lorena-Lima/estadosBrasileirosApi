package com.state.State.service;

import com.state.State.Entity.State;
import com.state.State.Entity.StateDto;
import com.state.State.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;


    public StateDto addNewState(StateDto state){
        State savedState = stateRepository.save(new State(state));
        return new StateDto(savedState);
    }

    public List<StateDto> list(long id){
        Optional<State> state = stateRepository.findById(id);
        return StateDto.toConvert(state);
    }

    public List<StateDto> filteredByRegion(String region){

        if(region == null) {
            List<State> state = stateRepository.findAll();
            return StateDto.toConvertToList(state);
        } else{
            List<State> state = stateRepository.findByRegion(region);
            return StateDto.toConvertToList(state);
        }
    }
    public void deleteById(Long id){
        stateRepository.deleteById(id);
    }
    public StateDto updateState(Long id, StateDto state) {

        State stateEntity = stateRepository.getOne(id);

        stateEntity.setName(state.getName() != null ? state.getName():stateEntity.getName());
        stateEntity.setPopulation(state.getPopulation() != null ? state.getPopulation():stateEntity.getPopulation());
        stateEntity.setCapital(state.getCapital() != null ? state.getCapital():stateEntity.getCapital());
        stateEntity.setArea(state.getArea() != null ? state.getArea(): stateEntity.getArea());
        stateEntity.setRegion(state.getRegion() != null ? state.getRegion():stateEntity.getRegion());

        stateRepository.save(stateEntity);

        return new StateDto(stateEntity);

    }
}
