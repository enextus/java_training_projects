package by.eduard.shapes;

import by.eduard.shapes.entity.Line;
import by.eduard.shapes.entity.Picture;
import org.springframework.boot.ApplicationRunner;

import java.util.List;

public class ShapesFlow implements ApplicationRunner {

    private final List<Line> lines;
    private final Picture picture;


    public ShapesFlow(List<Line> lines, Picture picture) {

    }

}
