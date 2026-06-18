package com.sit.example.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.example.layer2.Tea;
import com.sit.example.layer4.BreakFastService;
import com.sit.example.layer6.TeaAlreadyExistsException;

@RestController
@RequestMapping("/breakfast")
public class BreakFastController {

    @Autowired
    private BreakFastService breakfastService;

    @GetMapping("/getAllTeas")
    public List<Tea> getAllTeasFromService() {
        return breakfastService.selectAllTeas();
    }

    // http://localhost:8090/breakfast/addTea
    @PostMapping("/addTea")
    public ResponseEntity<?> createNewTea(@RequestBody Tea tea) {

        Tea newTea = null;

        try {
            newTea = breakfastService.insertTea(tea);
        } catch (TeaAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(e.getMessage());
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(newTea);
    }
}
