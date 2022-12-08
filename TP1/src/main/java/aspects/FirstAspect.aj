package aspects;

public aspect FirstAspect {
    pointcut pc1():execution( * org.example.Main.main(..));

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

//
        System.out.println("--------------------------------------------");
        System.out.println("around main from AspectJ with AspectJ syntax");
        System.out.println("--------------------------------------------");


    }


}
