package com.sparta.amenityclonecoding.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
    @Pattern(regexp = "^[A-Za-z0-9_\\.\\-]+@[A-Za-z0-9\\-]+\\.[A-Za-z0-9\\-]+$", message = "이메일 형식에 맞춰 작성해주세요.")
    @NotNull(message = "id를 입력해주세요")
    private String userEmail;
    @Size(min = 8, max = 15, message = "password는 8 이상, 15 이하만 가능합니다.")
    @Pattern(regexp = "^[a-zA-Z\\p{Punct}0-9]*$", message = "password는 알파벳 대소문자, 특수문자, 숫자만 가능합니다.")
    @NotNull(message = "password를 입력해주세요")
    private String userPassword;
    private String userRole;
    private String adminToken = "";
    private String userNickNm;
}
