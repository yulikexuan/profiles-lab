//: com.yulikexuan.sfg.profileslab.config.AuthorConfigProperties.java


package com.yulikexuan.sfg.profileslab.config;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@NoArgsConstructor
public class AuthorConfigProperties {

    @NotBlank
    private String email;

    @NotBlank
    private String name;

    @NotBlank
    private String company;

}///:~