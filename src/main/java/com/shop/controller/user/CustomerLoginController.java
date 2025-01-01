package com.shop.controller.user;

import com.shop.dto.CustomerDto;
import com.shop.process.user.CustomerLoginProcess;
import com.shop.provider.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerLoginController {
    @Autowired
    private CustomerLoginProcess process;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // 쿠키에서 id 추출하여 고객 조회
    //@GetMapping("/user/mypage")
    //public CustomerDto getCustomerByToken(@CookieValue(name ="accessToken")String token) {

    //}
}