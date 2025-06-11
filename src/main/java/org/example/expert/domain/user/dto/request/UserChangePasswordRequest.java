package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    @NotBlank
    @Size(min = 8, message = "뉴 비밀번호는 8자 이상 이어야 합니다.")
    @Pattern(regexp = ".*\\d.*", message = "뉴 비밀번호는 숫자를 반드시 포함해야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "뉴 비밀번호는 대문자를 반드시 포함해야 합니다.")
    private String newPassword;
}
