import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> Producto = new ArrayList<>();
        while (true) {
            System.out.println("Bienvenido al sistema de productos:");
            System.out.println("1. CRUD de productos");


            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();


            if (opcion == 1) {
                System.out.println("Seleccione una opción para Productos:");
                System.out.println("a. Agregar producto:");
                System.out.println("b. Eliminar producto");
                System.out.println("c. Listar producto:");
                System.out.println("d. actualizar producto:");

                char subopcionP = scanner.next().charAt(0);
                scanner.nextLine();

                switch (subopcionP) {
                    case 'a':

                        System.out.println("Ingrese los detalles del producto:");
                        System.out.print("codigo producto: ");
                        int codigo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("cantidsd del producto: ");
                        String cantidad = scanner.nextLine();
                        System.out.print("descripcion producto: ");
                        String descripcion = scanner.nextLine();

                        Producto productonuevo = new Producto(codigo, nombre, cantidad, descripcion);


                        Producto.add(productonuevo);

                        System.out.println("Producto agregado con exito.");
                        break;

                    case 'b':
                        if (Producto.isEmpty()) {
                            System.out.println("No hay productos para eliminar.");
                        } else {
                            System.out.println("Seleccione el producto a eliminar:");
                            for (int i = 0; i < Producto.size(); i++) {
                                System.out.println((i + 1) + ". " + Producto.get(i).getNombre());
                            }
                            int indiceEliminar = scanner.nextInt() - 1;
                            if (indiceEliminar >= 0 && indiceEliminar < Producto.size()) {
                                Producto.remove(indiceEliminar);
                                System.out.println("producto eliminado con éxito.");
                            } else {
                                System.out.println("Índice de producto fuera de rango.");
                            }
                        }
                        break;
                    case 'c':
                        //Listar

                        System.out.println("Listado de Productos disponibles:");
                        for (Producto producto : Producto) {
                            System.out.println("Codigo: " + producto.getCodigo() + ", Nombre: " + producto.getNombre());

                        }
                        break;

                    case 'd':
                        System.out.print("Ingrese el codigo del producto desea actualizar: ");
                        int codigoproducto = scanner.nextInt();
                        scanner.nextLine();
                        Producto productoActualizar = null;
                        for (Producto producto : Producto) {
                            if (producto.getCodigo() == codigoproducto) {
                                productoActualizar = producto;
                                break;
                            }
                        }

                        if (productoActualizar != null) {
                            System.out.println("Detalles actuales del producto:");
                            System.out.println("codigo: " + productoActualizar.getCodigo());
                            System.out.println("Nombre: " + productoActualizar.getNombre());

                            System.out.println("Ingrese los nuevos detalles del producto:");
                            System.out.print("Nuevo nombre: ");
                            String Nuevonombre = scanner.nextLine();

                            productoActualizar.setNombre(Nuevonombre);

                            System.out.println("Producto actualizada con éxito.");
                        } else {
                            System.out.println("No se ese encontro el producto.");
                        }

                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;

                }
            } else if (opcion == 2) {
                System.out.println("Saliendo del programa...");
                System.exit(0);
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

    }
}