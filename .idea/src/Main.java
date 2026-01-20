public class Main

{    //this is the main entry point
    public static void main (String[] args){

        Motorcycle m1 = new Motorcycle("RED");//object, pass in the constructor details(color) automatically adds in variable name
        System.out.println(m1.getColor());


        Motorcycle m2 = new Motorcycle("BLUE");
        System.out.println(m2.getColor());
    }

}
