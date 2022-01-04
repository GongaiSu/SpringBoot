package com.gyf.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.Map;

@Component
@PropertySource("classpath:application-den.properties")
@ConfigurationProperties("persion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persion implements Serializable {

    private String name;
    private Integer age;
    private Map usermap;

}
