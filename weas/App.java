public class App {
    public static void main(String[] args) throws Exception {
        //preparao los espacio para los objetos
        Suma modelo;
        Vista vista ;
        Controlador controlador;
        //inicio los objetos
        modelo = new Suma();
        vista = new Vista();
        controlador = new Controlador(modelo, vista);
        //metodos
        controlador.iniciar();
    }
}