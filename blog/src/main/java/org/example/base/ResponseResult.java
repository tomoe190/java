package org.example.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseResult {
    private boolean ok;

    private Object data;

    private String message;

}
