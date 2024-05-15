package dev.ansh.BookMyShow.controller;

import dev.ansh.BookMyShow.dto.UserLoginRequestDTO;
import dev.ansh.BookMyShow.dto.UserSignupRequestDTO;
import dev.ansh.BookMyShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody UserSignupRequestDTO userSignupRequestDTO) throws Exception {
        return ResponseEntity.ok(userService.signUp(userSignupRequestDTO.getName(), userSignupRequestDTO.getEmail(), userSignupRequestDTO.getPassword()));
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserLoginRequestDTO userLoginRequestDTO) throws Exception {
        return ResponseEntity.ok(userService.login(userLoginRequestDTO.getEmail(), userLoginRequestDTO.getPassword()));
    }
}
