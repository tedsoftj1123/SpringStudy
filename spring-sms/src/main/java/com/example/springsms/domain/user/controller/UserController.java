package com.example.springsms.domain.user.controller;

import com.example.springsms.domain.user.service.SendAuthCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final SendAuthCodeService sendAuthCodeService;
}
