package com.mang.example.lombok.app.review.domain;

import com.mang.example.lombok.app.common.domain.Common;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Review extends Common {

    private String userName;
    private String contents;

}
