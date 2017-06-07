import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by TMS on 02.06.2017.
 */
public class Start  {




    public static void main(String[]args){


       ClassPathXmlApplicationContext con= new ClassPathXmlApplicationContext("C.xml");
       SolverSqrt res=(SolverSqrt)con.getBean("solver");
       res.getX1();
       res.getX2();







//        Calculator cplus=new Plus(args[0],args[1]);
//        Calculator cminus=new Minus(args[0],args[1]);
//        System.out.println(cplus.calc());
//        Plus cc=new Plus("3","55");
//        System.out.println(args[0]+args[1]);
//        System.out.println(cc.calc());
    }



}
