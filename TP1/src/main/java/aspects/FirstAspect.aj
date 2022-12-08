package aspects;

public aspect FirstAspect {
    // method nexiste pqs pour se focqliser juste les qutre meth
    pointcut pc1():execution( * org.example.Main.man(..));

  /*  before():pc1(){
        System.out.println("--------------------------------------------");
        System.out.println("Before main from AspectJ with AspectJ syntax");
        System.out.println("--------------------------------------------");

    }
    after():pc1(){
        System.out.println("--------------------------------------------");
        System.out.println("After main from AspectJ with AspectJ syntax");
        System.out.println("--------------------------------------------");


    }*/


    void around():pc1(){
        System.out.println("--------------------------------------------");
        System.out.println("around main from AspectJ with AspectJ syntax");
        System.out.println("--------------------------------------------");
        proceed();
        System.out.println("--------------------------------------------");
        System.out.println("around main from AspectJ with AspectJ syntax");
        System.out.println("--------------------------------------------");


    }


}
