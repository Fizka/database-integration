package com.example.pk.mongodbproject.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Document
@NoArgsConstructor
public class Bike implements Serializable {

    @Id
    private Long instant;
    private Date dteday;
    private int season;
    private int yr;
    private int mnth;
    private int hr;
    private int holiday;
    private int weekday;
    private int workingday;
    private int weathersit;
    private float temp;
    private float atemp;
    private float hum;
    private float windspeed;
    private int casual;
    private int registered;
    private int cnt;

}
