package com.decagon.demo.controllers;

import com.decagon.demo.apiresponse.ApiResponse;
import com.decagon.demo.exceptions.CustomException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home
 */
@RestController
public class Home {

  @RequestMapping("/home")
  public ResponseEntity<ApiResponse<String>> home() {
    var res = new ApiResponse<String>(HttpStatus.OK);
    res.setData("Hello Production ready server");
    res.setMessage("our app is working");
    // throw new CustomException("testing exception", HttpStatus.BAD_REQUEST);
    return new ResponseEntity<>(res, res.getStatus());
  }
}