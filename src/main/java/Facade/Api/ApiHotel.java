package Facade.Api;

public class ApiHotel {
    public void buscarHoteles(String fechaInicio, String fechaFin, String origen, String destino)
    {
        System.out.println("--------------------------------------------------");
        System.out.println("Hoteles disponibles encontrados en la ruta, del " + fechaInicio + " al " + fechaFin);
        System.out.println("\tCiudad: Oruro - Hotel: Maya - 5*");
        System.out.println("\tCiudad: La Paz - Hotel: Presidente - 5*");
        System.out.println("\tCiudad: La Paz - Hotel: Mayor Plaza - 3*");
        System.out.println("\tCiudad: Cochabamba - Hotel: Cochabamba - 5*");
        System.out.println("\tCiudad: Cochabamba - Hotel: Prado - 4*");
        System.out.println("\tCiudad: Cobija - Hotel: Amazonas - 2*");
        System.out.printf("\tCiudad: %s - Hotel: %s - 3* \n", destino, destino);
        System.out.println("--------------------------------------------------");
    }
}
