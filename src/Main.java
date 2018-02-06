public class Main {

    public static void main(String[] args) {
        Ventana ventana=new Ventana("Inicio Sesion");
        ventana.insertarNombre("juan");
        ventana.insertarPassword("perez");
        boolean respuesta = ventana.validar();
        if(respuesta){
            System.out.println("al toque nomas perro");
        }
        else{
            System.out.println("get out bitch");
        }
    }
}
