package com.deloitte.restassignment.service;


import org.springframework.data.repository.CrudRepository;
import com.deloitte.restassignment.model.Quote;

public interface  QuoteService extends CrudRepository<Quote, Integer> {
    Iterable<Quote> findByFilmName(String filmName);

}
