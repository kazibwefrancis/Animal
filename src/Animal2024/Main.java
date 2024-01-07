package Animal2024;
class Animal{
    String Name;
    String Colour;
    static int legs;
    static int ears;



    public static void main(String[] args) {
         Animal d= new Animal();

         //instantiation for Dog
        d.Name="Spike";
        d.Colour="Brownish black";
        legs=4;
        ears=2;

        System.out.println("This is "+d.Name +" He is a " +d.Colour+" dog with "+legs +" legs"+" and "+ ears +" ears");


        Animal c= new Animal();
        //instantiation for Cat
        c.Name="Dennise";
        c.Colour="White";
        legs=4;
        ears=2;

        System.out.println("This is "+c.Name +" She is a " +c.Colour+" cat with "+legs +" legs"+" and "+ ears +" ears");

        Animal p= new Animal();
        //instantiation for person
        p.Name="Cathy";
        p.Colour="Chocolate";
        legs=4;
        ears=2;

        System.out.println("This is "+p.Name +" She is a " +p.Colour+" person with "+legs +" legs"+" and "+ ears +" ears");
    }
}