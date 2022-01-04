package com.gyf.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.Map;

@Component
@ConfigurationProperties("jdbc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private String url;
    private String username;
    private String password;
}
