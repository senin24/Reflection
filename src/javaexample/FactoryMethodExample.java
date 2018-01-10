package javaexample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryMethodExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
    	
    	String classString = "javaexample.ConcreteProductA";
    	Class<?> c = Class.forName(classString);
    	Constructor<?> ctr = c.getConstructor(String.class);
    	Object obj = ctr.newInstance(new Object[] { "arg1 for class ConcreteProductA" });
    	Product product = (Product) obj;
        System.out.printf("Created {%s}\n", product.getClass());
        ConcreteProductA concreteProductA = (ConcreteProductA) product;
        concreteProductA.methodConcreteProductA();
    	
        classString = "javaexample.ConcreteProductB";
    	c = Class.forName(classString);
    	ctr = c.getConstructor(String.class);
    	obj = ctr.newInstance(new Object[] { "arg1 for class ConcreteProductBBB" });
    	product = (Product) obj;
        System.out.printf("Created {%s}\n", product.getClass());
        ConcreteProductB concreteProductB = (ConcreteProductB) product;
        concreteProductB.methodConcreteProductB();
        }
    }