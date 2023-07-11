package com.mmencfel.dataSetColector.service;


import com.mmencfel.dataSetColector.model.RecordEntity;

class RecordValueMapper {
    private static final double MAX_COLOR_VALE = 255;
    private static final double FACTOR = 180;
    private static final int MAP_FACTOR = (int) Math.floor(FACTOR / MAX_COLOR_VALE);

    static void map(RecordEntity recordEntity) {
        mapColor(recordEntity);
    }

    private static RecordEntity mapColor(RecordEntity recordEntity) {
        return new RecordEntity.RecordEntityBuilder()
                .id(recordEntity.getId())
                .sentence(recordEntity.getSentence())
                .sentenceClass(recordEntity.getSentenceClass())
                .redValue(recordEntity.getRedValue()*MAP_FACTOR)
                .greenValue(recordEntity.getGreenValue()*MAP_FACTOR)
                .blueValue(recordEntity.getBlueValue()*MAP_FACTOR)
                .place(recordEntity.getPlace())
                .numberOfColorWorld(recordEntity.getNumberOfColorWorld())
                .numberOfPlaceWorld(recordEntity.getNumberOfPlaceWorld())
                .placeClass(recordEntity.getPlaceClass())
                .build();
    }
}
