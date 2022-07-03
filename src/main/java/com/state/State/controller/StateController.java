package com.state.State.controller;

import com.state.State.Entity.StateDto;
import com.state.State.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/states")
public class StateController {
    @Autowired
    private StateService stateService;

    @PostMapping
    public ResponseEntity<StateDto> createNewState(@RequestBody @Valid StateDto state){
        StateDto stateDto = stateService.addNewState(state);
        return ResponseEntity.ok(stateDto);
    }

   @GetMapping ("/{id}")
   public ResponseEntity<List<StateDto>> toList (@PathVariable Long id){
       List<StateDto> stateDto = stateService.list(id);
       return ResponseEntity.ok(stateDto);
   }

   @GetMapping
   public ResponseEntity<List<StateDto>> listByRegion(@RequestParam (required = false)String region){
            return ResponseEntity.ok(stateService.filteredByRegion(region));
   }

   @DeleteMapping ("/{id}")
    public ResponseEntity<Void> deleteState (@PathVariable Long id){
        stateService.deleteById(id);
        return ResponseEntity.noContent().build();
   }

   @PutMapping ("/{id}")
   public ResponseEntity<StateDto> updateState (@PathVariable Long id, @RequestBody StateDto state){
       return ResponseEntity.ok(stateService.updateState(id, state));
   }

}
