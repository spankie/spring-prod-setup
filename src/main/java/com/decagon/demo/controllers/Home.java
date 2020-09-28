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
    var message = "our app is working, and we have devtool running as well";
    res.setMessage(message);
    return new ResponseEntity<>(res, res.getStatus());
  }
}