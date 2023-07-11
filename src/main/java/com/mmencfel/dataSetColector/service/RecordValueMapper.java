package com.mmencfel.dataSetColector.service;


import com.mmencfel.dataSetColector.model.RecordEntity;

class RecordValueMapper {
    private static final double MAX_COLOR_VALE = 255;
    private static final double FACTOR = 180;
    private static final double MAP_FACTOR =  FACTOR / MAX_COLOR_VALE;

    static RecordEntity map(RecordEntity recordEntity) {
        return mapColor(recordEntity);
    }

    private static RecordEntity mapColor(RecordEntity recordEntity) {
        return new RecordEntity.RecordEntityBuilder()
                .id(recordEntity.getId())
                .sentence(recordEntity.getSentence())
                .sentenceClass(recordEntity.getSentenceClass())
                .redValue(calculateNewColorValue(recordEntity.getRedValue()))
                .greenValue(calculateNewColorValue(recordEntity.getGreenValue()))
                .blueValue(calculateNewColorValue(recordEntity.getBlueValue()))
                .place(recordEntity.getPlace())
                .numberOfColorWorld(recordEntity.getNumberOfColorWorld())
                .numberOfPlaceWorld(recordEntity.getNumberOfPlaceWorld())
                .placeClass(recordEntity.getPlaceClass())
                .build();
    }

    private static int calculateNewColorValue(int colorValue){
        return  (int)Math.floor(colorValue*MAP_FACTOR);
    }
}
