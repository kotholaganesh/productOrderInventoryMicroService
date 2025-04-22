package com.ganesh.encrypt.Controller;


import com.ganesh.encrypt.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class EncryptDecryptController {

    @Autowired
    private Encrypt encrypt;

    @GetMapping("/")
    public String Sample() {
        return "Hello World";
    }

    @PostMapping("/encrypt")
    public String encryptString(@RequestBody String input) throws Exception {
        if (input == null || input.isEmpty()) {
            return "Input string is null or empty";
        }
        return Encrypt.encrypt(input, "password", Encrypt.generateSalt());

    }

    @PostMapping("/decrypt")
    public String decryptString(@RequestBody String input) throws Exception {
        if (input == null || input.isEmpty()) {
            return "Input string is null or empty";
        }
        return Encrypt.decrypt(input, "password", Encrypt.generateSalt());

    }


}

