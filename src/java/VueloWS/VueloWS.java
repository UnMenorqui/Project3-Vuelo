/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VueloWS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Toni
 */
@WebService(serviceName = "VueloWS")
public class VueloWS {

    /**
     * Web service operation
     * @param id_vuelo
     * @param fecha
     * @return 
     */
    @WebMethod(operationName = "consulta_libres")
    public int consulta_libres(@WebParam(name = "id_vuelo") int id_vuelo, @WebParam(name = "fecha") int fecha) {
        //TODO write your implementation code here:
        return 0;
    }

    /**
     * Web service operation
     * @param id_vuelo
     * @param fecha
     * @return 
     */
    @WebMethod(operationName = "reserva_plaza")
    public int reserva_plaza(@WebParam(name = "id_vuelo") int id_vuelo, @WebParam(name = "fecha") int fecha) {
        //TODO write your implementation code here:
        return 0;
    }
}
