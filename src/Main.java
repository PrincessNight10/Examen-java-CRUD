
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
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
                System.out.println("c. Listar productos:");
                System.out.println("d. Actualizar producto:");
                char subopcionP = scanner.next().charAt(0);
                scanner.nextLine();
                switch (subopcionP) {
                    case 'a':
                        System.out.println("Ingrese los detalles del producto:");
                        System.out.print("Código producto: ");
                        int codigo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Cantidad del producto: ");
                        String cantidad = scanner.nextLine();
                        System.out.print("Descripción producto: ");
                        String descripcion = scanner.nextLine();
                        Producto productoNuevo = new Producto(codigo, nombre, cantidad, descripcion);
                        productos.add(productoNuevo);
                        System.out.println("Producto agregado con éxito.");
                        break;
                    case 'b':
                        if (productos.isEmpty()) {
                            System.out.println("No hay productos para eliminar.");
                        } else {
                            System.out.println("Seleccione el producto a eliminar:");
                            for (int i = 0; i < productos.size(); i++) {
                                System.out.println((i + 1) + ". " + productos.get(i).getNombre());
                            }
                            int indiceEliminar = scanner.nextInt() - 1;
                            if (indiceEliminar >= 0 && indiceEliminar < productos.size()) {
                                productos.remove(indiceEliminar);
                                System.out.println("Producto eliminado con éxito.");
                            } else {
                                System.out.println("Índice de producto fuera de rango.");
                            }
                        }
                        break;
                    case 'c':
                        if (productos.isEmpty()) {
                            System.out.println("No hay productos disponibles.");
                        } else {
                            System.out.println("Listado de Productos disponibles:");
                            for (Producto producto : productos) {
                                System.out.println("Código: " + producto.getCodigo() + ", Nombre: " + producto.getNombre());
                            }
                        }
                        break;
                    case 'd':
                        System.out.print("Ingrese el código del producto que desea actualizar: ");
                        int codigoProducto = scanner.nextInt();
                        scanner.nextLine();
                        Producto productoActualizar = null;
                        for (Producto producto : productos) {
                            if (producto.getCodigo() == codigoProducto) {
                                productoActualizar = producto;
                                break;
                            }
                        }
                        if (productoActualizar != null) {
                            System.out.println("Detalles actuales del producto:");
                            System.out.println("Código: " + productoActualizar.getCodigo());
                            System.out.println("Nombre: " + productoActualizar.getNombre());
                            System.out.println("Cantidad: " + productoActualizar.getCantidad());
                            System.out.println("Descripción: " + productoActualizar.getDescripcion());
                            System.out.println("Ingrese los nuevos detalles del producto:");
                            System.out.print("Nuevo nombre: ");
                            String nuevoNombre = scanner.nextLine();
                            productoActualizar.setNombre(nuevoNombre);
                            System.out.print("Nueva cantidad: ");
                            String nuevaCantidad = scanner.nextLine();
                            productoActualizar.setCantidad(nuevaCantidad);
                            System.out.print("Nueva descripción: ");
                            String nuevaDescripcion = scanner.nextLine();
                            productoActualizar.setDescripcion(nuevaDescripcion);
                            System.out.println("Producto actualizado con éxito.");
                        } else {
                            System.out.println("No se encontró el producto.");
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

 
 
 

 
 
 
 
 


 
 


 

 
 