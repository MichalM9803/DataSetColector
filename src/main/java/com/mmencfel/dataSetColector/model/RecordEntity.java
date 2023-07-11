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

    public RecordEntity() {
    }

    public RecordEntity(RecordEntity other) {
        this.id = other.id;
        this.sentence = other.sentence;
        this.sentenceClass = other.sentenceClass;
        this.redValue = other.redValue;
        this.greenValue = other.greenValue;
        this.blueValue = other.blueValue;
        this.place = other.place;
        this.numberOfColorWorld = other.numberOfColorWorld;
        this.numberOfPlaceWorld = other.numberOfPlaceWorld;
        this.placeClass = other.placeClass;
    }

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

    public int getSentenceClass() {
        return sentenceClass;
    }

    public int getPlaceClass() {
        return placeClass;
    }

    public static class RecordEntityBuilder {
        private Long id;
        private String sentence;
        private int sentenceClass;
        private int redValue;
        private int greenValue;
        private int blueValue;
        private String place;
        private int numberOfColorWorld;
        private int numberOfPlaceWorld;
        private int placeClass;


        public RecordEntityBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public RecordEntityBuilder sentence(String sentence) {
            this.sentence = sentence;
            return this;
        }

        public RecordEntityBuilder sentenceClass(int sentenceClass) {
            this.sentenceClass = sentenceClass;
            return this;
        }

        public RecordEntityBuilder redValue(int redValue) {
            this.redValue = redValue;
            return this;
        }

        public RecordEntityBuilder greenValue(int greenValue) {
            this.greenValue = greenValue;
            return this;
        }

        public RecordEntityBuilder blueValue(int blueValue) {
            this.blueValue = blueValue;
            return this;
        }

        public RecordEntityBuilder place(String place) {
            this.place = place;
            return this;
        }

        public RecordEntityBuilder numberOfColorWorld(int numberOfColorWorld) {
            this.numberOfColorWorld = numberOfColorWorld;
            return this;
        }

        public RecordEntityBuilder numberOfPlaceWorld(int numberOfPlaceWorld) {
            this.numberOfPlaceWorld = numberOfPlaceWorld;
            return this;
        }

        public RecordEntityBuilder placeClass(int placeClass) {
            this.placeClass = placeClass;
            return this;
        }

        public RecordEntity build() {
            RecordEntity recordEntity = new RecordEntity();
            recordEntity.id = this.id;
            recordEntity.sentence = this.sentence;
            recordEntity.sentenceClass = this.sentenceClass;
            recordEntity.redValue = this.redValue;
            recordEntity.greenValue = this.greenValue;
            recordEntity.blueValue = this.blueValue;
            recordEntity.place = this.place;
            recordEntity.numberOfColorWorld = this.numberOfColorWorld;
            recordEntity.numberOfPlaceWorld = this.numberOfPlaceWorld;
            recordEntity.placeClass = this.placeClass;
            return recordEntity;
        }
    }

}


