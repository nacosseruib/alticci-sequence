package com.example.alticcisequence.controller;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@Controller
@RestController
public class AlticciSequenceController {

    @ApiOperation(value = "Alticci Sequence", notes = "This endpoint returns array of values from the Alticci sequence.")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Alticci Sequence Generated")
    })

    @GetMapping("/get-alticci/{n}")
    @Cacheable("alticci")
    public ResponseEntity<List<Integer>> mapAlticci(@PathVariable(value = "n") int n) {

        List<Integer> getComputation = new ArrayList<>();

        int i = 0;
        do{
            getComputation.add(computeAlticci(i));
            i++;
        }while (i < n);

        return new ResponseEntity<List<Integer>>(getComputation, HttpStatus.OK);
    }

    private int computeAlticci(int n) {

        if (n < 1)
            return 0;
        else if (n < 3)
            return 1;
        else
            //Given this: a(n-3) + a(n-2)
            return computeAlticci(n - 3) + computeAlticci(n - 2);
    }

}
