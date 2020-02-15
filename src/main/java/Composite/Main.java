package Composite;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("\n---- Catalogo de Componentes por unidad ----");
        new PlacaMadre().mostrar();
        new Procesador().mostrar();
        new LectorDVD().mostrar();
        new Ram().mostrar();
        new Carcasa().mostrar();

        System.out.println("\n---- Varios componentes para venderse por unidad ----");
        IComponente paquete = new Compuesto();
        paquete.anadir(new PlacaMadre());
        paquete.anadir(new Procesador());
        paquete.mostrar();

        System.out.println("\n---- Combo CPU completa con descuentos----");
        ComboCpu cpu = new ComboCpu();
        cpu.mostrar();
    }
}
