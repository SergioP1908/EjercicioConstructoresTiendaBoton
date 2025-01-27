/*
 * Clase Tienda
	-main
	3 Objetos de tipo Maniqui
 */

public class Tienda {


    private String nombre; //creamos la variable nombre

    
    public Tienda(String nombre) { //creamos el constructor del nombre
        this.nombre = nombre;
    }


    public static void main(String[] args) {

        Tienda tienda = new Tienda("Loro piana");

        tienda.nombre = " "; // Al ser privada si puedo modificar el nombre porque esta en la misma clase
        
        Maniqui [] maniquies = tienda.abrirTienda();

        tienda.mostrarEscaparate(maniquies);

       
    }

    public Maniqui[] abrirTienda (){

        Vestido vestido = new Vestido("verde", "L", 40);
        Maniqui maniqui1 = new Maniqui(1, vestido);

        Boton boton = new Boton("negro", "redondo", "pequeño");

        Pantalon pantalon = new Pantalon("negro", "L", 30, boton);//Al pedir un boton
        //es necesario crear primero el atributo boton para que pueda iniciarse

        Camisa camisa = new Camisa("blanco", 20.99, "M");



        Boton boton1 = new Boton("blanco", "redondo", "pequeño");
        Boton boton2 = new Boton("azul", "redondo", "pequeño");
        Boton boton3 = new Boton("gris", "redondo", "pequeño");

        //Boton [] botones = new Boton[3];

        Boton [] botones = {boton,boton1,boton2,boton3};

        Camisa camisa1 = new Camisa("rojo", 15.99, "L", botones);

        Camisa camisa2 = new Camisa("blanco", 19.99, "M", botones);

        Maniqui maniqui2 = new Maniqui(2, camisa1, pantalon);

        Maniqui maniqui3 = new Maniqui(3);

        /* System.out.println(maniqui2.getCamisa().getBotones()[0].getColor());//Se ingresa dentro del maniqui2,
        //se busca su camisa, se ingresa a la posicion del array del boton y se obtiene el color que se necesita

        Boton b = maniqui2.getCamisa().getBotones()[0];

        System.out.println(b.getColor());
        System.out.println(b.getForma());
        System.out.println(b.getTamanio());*/

        Maniqui [] maniquies = {maniqui1,maniqui2,maniqui3};

        return maniquies;

    }

    private void mostrarEscaparate(Maniqui [] maniquies){

        for (Maniqui maniqui : maniquies) {
            
            System.out.println("Informacion del maniqui : " + maniqui.getId());
            System.out.println("Pantalon : ");

            Pantalon pantalon = maniqui.getPantalon();

            if(pantalon !=null){
                
                System.out.println("\t Color: " +pantalon.getColor());
                System.out.println("\t Talla: "+pantalon.getTalla());
                System.out.println("\t Precio: "+ pantalon.getPrecio());
                System.out.println("\t Color boton: "+pantalon.getBoton().getColor());
            }
        }

    }  

    private void desvestirManiqui(Maniqui [] maniquies){
        for (Maniqui maniqui : maniquies) {
            maniqui.desvestir();
        }
    }

}
