public class Main {
    public static void main(String[] args) {
        Autos miauto;
        Autos miauto2;
        Autos miauto3;
        miauto=new Autos("Chevrolet");
        miauto2=new Autos("Bugatti");
        miauto3=new Autos("Volkswagen");
        miauto.setAnio(2);
        miauto2.setAnio(4);
        miauto3.setAnio(5);
        miauto.setColor("Rojo");
        miauto2.setColor("Plomo");
        miauto3.setColor("Negro");
        System.out.println("**Auto 1**");
        System.out.println(miauto.getMarca());
        System.out.println(miauto.getAnio());
        System.out.println(miauto.getColor());
        System.out.println("**Auto 2**");
        System.out.println(miauto2.getMarca());
        System.out.println(miauto2.getAnio());
        System.out.println(miauto2.getColor());
        System.out.println("**Auto 3**");
        System.out.println(miauto3.getMarca());
        System.out.println(miauto3.getAnio());
        System.out.println(miauto3.getColor());
        int sumaanios=miauto.getAnio()+miauto2.getAnio()+miauto3.getAnio();
        System.out.println("La suma de los años de los autos es "+sumaanios);
    }
}