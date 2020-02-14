package Facade.Api;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class ApiVuelo {
    public void buscarVuelos(String fechaInicio, String fechaFin, String origen, String destino)
    {
        System.out.println("--------------------------------------------------");
        System.out.println("Rutas encontrados del " + fechaInicio + " al " + fechaFin);
        System.out.printf("Origen: %s Destino: %s \n", origen, destino);
        System.out.println("\tOruro - La Paz");
        System.out.println("\tLa Paz - Cochabamba");
        System.out.println("\tCochabamba - Santa Cruz");
        System.out.printf("\tSanta Cruz - %s\n", destino);
        System.out.println("--------------------------------------------------");
    }
}
