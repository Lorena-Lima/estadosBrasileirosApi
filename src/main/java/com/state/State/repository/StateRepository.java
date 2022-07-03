package com.state.State.repository;

import com.state.State.Entity.State;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StateRepository extends JpaRepository <State, Long>{

    List<State> findByRegion(String region);
}
