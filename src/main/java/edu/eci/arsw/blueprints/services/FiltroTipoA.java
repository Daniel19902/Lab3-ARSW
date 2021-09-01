package edu.eci.arsw.blueprints.services;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class FiltroTipoA implements Filtro{

    @Override
    public Blueprint filtrar(Blueprint blueprint) {
        List<Point> points = new LinkedList<>();
        points.add(blueprint.getPoints().get(0));
        for(int i = 1; i< blueprint.getPoints().size(); i++){
            if (!blueprint.getPoints().get(i).equals(blueprint.getPoints().get(i-1))){
                points.add(blueprint.getPoints().get(i));
            }
        }
        blueprint.setPoints(points);
        return blueprint;
    }
}
