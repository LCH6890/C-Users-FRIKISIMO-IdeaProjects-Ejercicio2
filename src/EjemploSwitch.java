public class EjemploSwitch{

    public static void main (String[]args) {
        var estacion = "Invierno";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion);
        }

    }
}
