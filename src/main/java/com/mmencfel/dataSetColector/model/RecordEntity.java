package com.mmencfel.dataSetColector.model;

import javax.persistence.*;

@Entity
@Table(name = "ml_set")
public class RecordEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "sentence", columnDefinition = "TEXT")
    private String sentence;

    @Column(name = "sentence_class")
    private int sentenceClass;
    @Column(name = "red_value")
    private int redValue;

    @Column(name = "green_value")
    private int greenValue;

    @Column(name = "blue_value")
    private int blueValue;

    @Column(name = "place")
    private String place;

    @Column(name = "number_of_color_world")
    private int numberOfColorWorld;

    @Column(name = "number_of_place_world")
    private int numberOfPlaceWorld;

    @Column(name = "place_class")
    private int placeClass;


    public Long getId() {
        return id;
    }

    public String getSentence() {
        return sentence;
    }


    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    public String getPlace() {
        return place;
    }

    public int getNumberOfColorWorld() {
        return numberOfColorWorld;
    }

    public int getNumberOfPlaceWorld() {
        return numberOfPlaceWorld;
    }

}
