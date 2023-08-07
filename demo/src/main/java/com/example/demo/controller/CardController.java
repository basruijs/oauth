package com.example.demo.controller;

import com.example.demo.model.Card;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/card")
public class CardController {

    @GetMapping(value = "/id")
    public Card findOne(@PathVariable Long id){
        return new Card(10L, "Abcdef");
    }

    @GetMapping
    public List findAll(){
        List cardList = new ArrayList();
        cardList.add(new Card(10L, "Abcdef"));
        cardList.add(new Card(11L, "Ghijkl"));
        return cardList;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody Card newCard){
        System.out.println("card created");
    }

}
