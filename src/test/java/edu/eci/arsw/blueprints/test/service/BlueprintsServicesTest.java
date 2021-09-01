package edu.eci.arsw.blueprints.test.service;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BlueprintsServicesTest {

    @Test
    public void filtrarTipoATest() throws BlueprintPersistenceException, BlueprintNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices bps = ac.getBean(BlueprintsServices.class);
        Point[] pts=new Point[]{new Point(7, 10),new Point(3, 4),new Point(5, 6),new Point(7, 10),new Point(7, 10)};
        Blueprint bp=new Blueprint("john", "thepaint",pts);
        bps.addNewBlueprint(bp);
        Assert.assertEquals(bps.getFiltrarBlueprint("john","thepaint").getPoints().size(),4);
    }
    @Test
    public void filtrarTipoBTest() throws BlueprintPersistenceException, BlueprintNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices bps = ac.getBean(BlueprintsServices.class);
        Point[] pts=new Point[]{new Point(7, 10),new Point(3, 4),new Point(5, 6),new Point(7, 10),new Point(7, 10)};
        Blueprint bp=new Blueprint("john", "thepaint",pts);
        bps.addNewBlueprint(bp);
        Assert.assertEquals(bps.getFiltrarBlueprint("john","thepaint").getPoints().size(),3);
    }
}
