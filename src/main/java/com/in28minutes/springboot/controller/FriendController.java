package com.in28minutes.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.service.FriendSvc;

@RestController
public class FriendController {
	@Autowired
	private FriendSvc friendService;
	
	@PostMapping("/friend/{emailID1,emailID2}")
	public ResponseEntity<void> connectFriends()

}
