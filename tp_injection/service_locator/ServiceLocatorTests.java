package service_locator;

import container.*;


public class ServiceLocatorTests extends junit.framework.TestCase{

    public void testServiceLocator() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./service_locator/README.TXT");
        System.out.println(ctx);
        ServiceLocatorI serviceLocator = null;
        serviceLocator=ctx.getBean("serviceLocator");

        System.out.println("Liste des services accessibles: ");
        for(String service : ctx){
            System.out.println("\t" + service);
        }
        System.out.println("------------------------------------------------");
        for(String service : serviceLocator){
            System.out.println("\t" + service);
        }
        System.out.println("************************************************");
        
        question1.exemples.Table table = serviceLocator.lookup("table");
        table.ajouter(33);table.ajouter(33);
        assertEquals(2,table.taille());
        
        question2.patron_strategie.Context strat = serviceLocator.lookup("contextAdd");
        assertTrue("Error in strategy",strat.executeStrategy(2, 3)==5);
        
        strat = serviceLocator.lookup("contextPow");
        assertTrue("Error in strategy",strat.executeStrategy(5, 2)==25);
        
    }
}
