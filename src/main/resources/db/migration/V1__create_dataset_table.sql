CREATE TABLE if not exists ml_set(

                                    id BIGINT auto_increment primary key ,
                                    sentence TEXT,
                                    red_value INT,
                                    green_value INT,
                                    blue_value INT,
                                    place VARCHAR(255),
                                    number_of_color_world INT,
                                    number_of_place_world INT

);