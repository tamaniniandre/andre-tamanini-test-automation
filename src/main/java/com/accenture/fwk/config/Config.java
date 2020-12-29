package com.accenture.fwk.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Config {

    private String browser;

    private String defaultWaitTimeInSeconds;

    private String defaultUrl;

    private String isHeadless;

}
