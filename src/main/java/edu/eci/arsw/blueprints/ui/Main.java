package edu.eci.arsw.blueprints.ui;


import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;

public class Main {

    public static void main(String[] args) throws BlueprintPersistenceException, BlueprintNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices bps = ac.getBean(BlueprintsServices.class);
        // Add BluePrint
        //Point[] pts=new Point[]{new Point(0, 0),new Point(10, 10)};
        //Blueprint bp=new Blueprint("john", "thepaint",pts);
        //bps.addNewBlueprint(bp);
        // Consultar BluePrint
        //Blueprint consultarBluePrint = bps.getBlueprint("john","thepaint");
        //System.out.println(consultarBluePrint);
        // Consultar BluePrint By Author
        //Set<Blueprint> consultarByAuthor = bps.getBlueprintsByAuthor("john");
        //System.out.println(consultarByAuthor);
        // Consultar all Blueprints
        //Point[] pts2=new Point[]{new Point(0, 0),new Point(10, 10)};
        //Blueprint bp1=new Blueprint("john2", "thepaint2",pts2);
        //Blueprint bp2=new Blueprint("john3", "thepaint3",pts2);
        //Blueprint bp3=new Blueprint("john4", "thepaint4",pts2);
        //Blueprint bp4=new Blueprint("john5", "thepaint5",pts2);
        //bps.addNewBlueprint(bp1);
        //bps.addNewBlueprint(bp2);
        //bps.addNewBlueprint(bp3);
        //bps.addNewBlueprint(bp4);
        //System.out.println(bps.getAllBlueprints());
        //filtros
        Point[] pts=new Point[]{new Point(7, 10),new Point(3, 4),new Point(5, 6),new Point(7, 10),new Point(7, 10)};
        Blueprint bp=new Blueprint("john", "thepaint",pts);
        bps.addNewBlueprint(bp);
        System.out.println(bps.getFiltrarBlueprint("john","thepaint"));
    }

}
