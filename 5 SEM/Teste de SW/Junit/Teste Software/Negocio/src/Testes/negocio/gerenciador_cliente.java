package Testes.negocio;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Negocio.Cliente;
import Negocio.GerenciadoraClientes;

public class gerenciador_cliente {
    @Test
    public void testPesquisaCliente(){
        //criando alguns clientes
        Cliente c1=new Cliente(1, "jose Dranka", 23, "sdadad@hotmail.com", 1, true);
        Cliente c2 = new Cliente(2, "Dranka", 15, "asasdasd@gmailcom", 2, true);

        List<Cliente>clientesDoBanco = new ArrayList();
        clientesDoBanco.add(c1);
        clientesDoBanco.add(c2);

        GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
        
        
        //chamar metodo pesquisar cliente
        Cliente cliente = gerClientes.pesquisaCliente(1);

        assertEquals(cliente.getId(),1);
        assertEquals(cliente.getEmail(),"sdadad@hotmail.com");





    }
    @Test
    public void testeRemoveCliente(){

        //criando alguns clientes
        Cliente c1=new Cliente(1, "jose Dranka", 23, "sdadad@hotmail.com", 1, true);
        Cliente c2 = new Cliente(2, "Dranka", 15, "asasdasd@gmailcom", 2, true);

        List<Cliente>clientesDoBanco = new ArrayList();
        clientesDoBanco.add(c1);
        clientesDoBanco.add(c2);

        GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);

        boolean clienteRemovido = gerClientes.removeCliente(1);
        assertEquals(clienteRemovido, true);
        /* ou */
        assertTrue(clienteRemovido);
        assertEquals(gerClientes.getClientesDoBanco().size(),1);
        assertNull(gerClientes.pesquisaCliente(1));

    }
}
