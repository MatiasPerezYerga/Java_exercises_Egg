package guia7.ej6.main;

import guia7.ej6.entidades.Producto;
import guia7.ej6.servicios.ProductoServicios;
import java.util.Scanner;

public class ej6Main {

    public static void main(String[] args) {

        Integer a = new Integer(3);
        Integer b = new Integer(3);
        
        System.out.println(a + " - " + b);
        if (a == b) {
            
               
            System.out.println("TRUE");
        }else{System.out.println("false");}

//            Scanner leer = new Scanner(System.in);
//        ProductoServicios asistenteOnline = new ProductoServicios();
//        Producto p= new Producto(); // tengo que crear un producto ya que el bucle necesita algo inicializado  en el case 2
//        String nombreQuitar="";// tambien tengo que crear un nombreQuitar por default ya que lo requiere el bucle.
//        
//        int resp = 0;
//        do {
//            System.out.println("Bienvenido a la tienda Online");
//            System.out.println("Ingrese el numero de la opción que desea:");
//            System.out.println("1.Crear Producto");
//            System.out.println("2.Agregar al e-commerce");
//            System.out.println("3.Mostrar el e-comerce");
//            System.out.println("4.Ordenar alfabeticamente la tienda por nombre");
//            System.out.println("5.Ordenar alfabeticamente la tienda por categoría");
//            System.out.println("6.Ordenar alfabeticamente la tienda por precio");
//            System.out.println("7.Eliminar producto de la tienda");
//            System.out.println("8.Salir");
//            resp = leer.nextInt();
//
//            switch (resp) {
//
//                case 1:
//                     p = asistenteOnline.crearProducto();
//                     System.out.println("__________________________________________________");
//                     System.out.println("***SE HA CREADO CON EXITO EL PRODUCTO***");
//                    break;
//
//                case 2:
//                    System.out.println("__________________________________________________");
//                    asistenteOnline.addProdEcomerce(p);
//                    System.out.println("Se ha agregado "+p.getNombre()+" al E-commerce");
//                    break;
//                case 3:
//                    System.out.println("__________________________________________________");
//                    asistenteOnline.mostrarEcomerce();
//                    ;
//                    break;
//                case 4:
//                    System.out.println("__________________________________________________");
//                    asistenteOnline.ordenarPorNombre();
//                    break;
//                case 5:
//                    System.out.println("__________________________________________________");
//                    asistenteOnline.ordenarPorCategoria();
//                    break;
//                    case 6:
//                    System.out.println("__________________________________________________");
//                    asistenteOnline.ordenarPorPrecio();
//                    break;
//                case 7:
//                    System.out.println("__________________________________________________");
//                    System.out.println("Ingrese el nombre del Producto que desea eliminar");
//                    nombreQuitar=leer.next();
//                    asistenteOnline.deleteProdEcomerce(nombreQuitar);
//                    break;
//                case 8:
//                    System.out.println("__________________________________________________");;
//                    break;
//
//            }
//
//        } while (resp != 8);
//
//    }
    }

}
