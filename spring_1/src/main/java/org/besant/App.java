package org.besant;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import orderfulfillmentservice.OrderFulfillment;
import org.springframework.core.io.ClassPathResource;

public class App
{
    public static void main( String[] args )
    {

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        OrderFulfillment orderFulfillment = (OrderFulfillment) beanFactory.getBean("order");
        orderFulfillment.placeOrder();

        System.out.println();
        System.out.println();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        OrderFulfillment orderFulfillment2 = (OrderFulfillment) context.getBean("order");
        orderFulfillment2.placeOrder();


    }
}
