import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

/**
 * Created by TMS on 02.06.2017.
 */
public class Start  {



    public static void main(String[]args){


       ClassPathXmlApplicationContext con= new ClassPathXmlApplicationContext("C.xml");
       Calculator cPlus=(Calculator)con.getBean("plus" );
       System.out.println(cPlus.calc());
       Calculator cMinus=(Calculator)con.getBean("minus");
       System.out.println(cMinus.calc());
       Calculator cUmn=(Calculator)con.getBean("umnozhenie");
       System.out.println(cUmn.calc());
       Calculator cDel=(Calculator)con.getBean("delenie");
       System.out.println(cDel.calc());
//        Calculator cplus=new Plus(args[0],args[1]);
//        Calculator cminus=new Minus(args[0],args[1]);
//        System.out.println(cplus.calc());
//        Plus cc=new Plus("3","55");
//        System.out.println(args[0]+args[1]);
//        System.out.println(cc.calc());
    }



}
