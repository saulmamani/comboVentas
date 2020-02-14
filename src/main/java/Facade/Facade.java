package Facade;

import Facade.Api.ApiHotel;
import Facade.Api.ApiVuelo;

public class Facade {
    ApiHotel hotel;
    ApiVuelo vuelo;

    public Facade() {
        hotel = new ApiHotel();
        vuelo = new ApiVuelo();
    }

    public void buscar(String fechaInicio, String fechaFin, String origen, String destino)
    {
        vuelo.buscarVuelos(fechaInicio, fechaFin, origen, destino);
        hotel.buscarHoteles(fechaInicio, fechaFin, origen, destino);
    }
}
