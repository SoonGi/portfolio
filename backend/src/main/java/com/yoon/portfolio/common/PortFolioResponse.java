package com.yoon.portfolio.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * PortFolioResponse
 */
@Builder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PortFolioResponse {

    private String result;
    private String token;
}