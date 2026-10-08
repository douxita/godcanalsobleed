package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JD implements Switch{
    String name;
    private boolean status; // true表示开启，false表示关闭

    @Override
    public void press() {
        status = !status;
    }
}
