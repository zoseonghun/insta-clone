package com.example.instagramclone.controller.rest;

import com.example.instagramclone.domain.member.dto.request.LoginRequest;
import com.example.instagramclone.domain.member.dto.request.SignUpRequest;
import com.example.instagramclone.domain.member.dto.response.DuplicateCheckResponse;
import com.example.instagramclone.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {

    private final MemberService memberService;

    // 회원가입 요청
    @PostMapping("/signup")
    public ResponseEntity<Map<String, Object>> signUp(@RequestBody @Valid SignUpRequest signUpRequest) {
        log.info("request for signup: {}", signUpRequest.getUsername());
        memberService.signUp(signUpRequest);

        return ResponseEntity
                .ok()
                .body(Map.of(
                        "message", "회원가입이 완료되었습니다.",
                        "username", signUpRequest.getUsername()
                ));
    }

    // 중복확인을 검사하는 API
    @GetMapping("/check-duplicate")
    public ResponseEntity<DuplicateCheckResponse> checkDuplicate(
            @RequestParam String type,
            @RequestParam String value
    ) {
        log.info("check duplicate type: {}, value: {}", type, value);

        DuplicateCheckResponse responseDto = memberService.checkDuplicate(type, value);

        return ResponseEntity.ok().body(responseDto);
    }

    // 로그인 검증 API
    // GET방식의 특징 : ? 를 사용할 수 있음 => 보안상 좋지않음
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid LoginRequest loginRequest) {

        log.info("request for authentication user : {}", loginRequest.getUsername());

        Map<String, Object> responseMap = memberService.authenticate(loginRequest);

        return ResponseEntity.ok().body(responseMap);
    }

}
