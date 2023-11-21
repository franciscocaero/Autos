 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Autos miauto;
        Autos miauto2;
        Autos miauto3;

        miauto=new Autos("Chevrolet");
        miauto2=new Autos("Bugatti");
        miauto3=new Autos("Volkswagen");
        miauto.setAnio(2012);
        miauto2.setAnio(2015);
        miauto3.setAnio(2009);
        miauto.setColor("Rojo");
        miauto2.setColor("Plomo");
        miauto3.setColor("Negro");
        Scanner miVariable=new Scanner(System.in);
        Scanner miVariable2=new Scanner(System.in);
        Scanner miVariable3=new Scanner(System.in);
            System.out.println("Ingrese el año del segundo auto");
            int nuevoAuto=miVariable.nextInt();
            System.out.println("Ingrese la marca del segundo auto");
            String nuevama=miVariable2.nextLine();
        System.out.println("Ingrese el color del segundo auto");
        String nuevoC=miVariable3.nextLine();
        miauto2.setAnio(nuevoAuto);
        miauto2.setMarca(nuevama);
        miauto2.setColor(nuevoC);
        System.out.println("**Auto 1**");
        System.out.println(miauto.getMarca());
        System.out.println(miauto.getAnio());
        System.out.println(miauto.getColor());
        System.out.println("\n**Auto 2**");
        System.out.println(miauto2.getMarca());
        System.out.println(miauto2.getAnio());
        System.out.println(miauto2.getColor());
        System.out.println("\n**Auto 3**");
        System.out.println(miauto3.getMarca());
        System.out.println(miauto3.getAnio());
        System.out.println(miauto3.getColor());

        int sumaanios=miauto.getAnio()+miauto2.getAnio()+miauto3.getAnio();
        System.out.println("\nLa suma de los años de los autos es "+sumaanios);
    }
}