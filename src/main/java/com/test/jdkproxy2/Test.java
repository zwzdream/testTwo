package com.test.jdkproxy2;

/**
 * @author WH1707008
 * @date 2018/6/6 11:13
 */
public class Test {
    public static void main(String[] args) {
   /*   Cat cat =new Cat();
      AnimalInvocationHandle catInvocationHandle=new AnimalInvocationHandle(cat);
      Animal catProxy= (Animal) catInvocationHandle.getProxyObject();
        catProxy.eat("香蕉");
      catProxy.sleep("小三");
      catProxy.exercise("游泳","2小时");*/


      Dog dog=new Dog();
       AnimalInvocationHandle dogInvocationHandle=new AnimalInvocationHandle(dog);
       Animal dogProxy=(Animal)dogInvocationHandle.getProxyObject();
        System.out.println(dogProxy.eat("香蕉"));
        System.out.println(dogProxy.sleep("小三"));
        System.out.println(dogProxy.exercise("游泳","2小时"));


    }

    @org.junit.Test
    public  void testProxy(){
        Dog dog=new Dog();
        AnimalInvocatonCglib animalInvocatonCglib=new AnimalInvocatonCglib();
        animalInvocatonCglib.bind(dog);
        Animal proxy=(Animal)animalInvocatonCglib.generateProxy();
        System.out.println(proxy.eat("香蕉"));
        System.out.println(proxy.sleep("小三"));
        System.out.println(proxy.exercise("游泳","2小时"));

    }
}
