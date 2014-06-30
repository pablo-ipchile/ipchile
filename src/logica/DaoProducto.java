package logica;

import java.util.ArrayList;

import entidades.producto;
import Datos.DBdaoProducto;
import interfaces.IdaoProducto;

public class DaoProducto implements IdaoProducto{
private DBdaoProducto daoProducto = new DBdaoProducto();
	@Override
	public void agreProducto(producto producto) {
		// TODO Auto-generated method stub
		daoProducto.agreProducto(producto);
	}

	@Override
	public void eliminarProducto(int codigo) {
		// TODO Auto-generated method stub
		daoProducto.eliminarProducto(codigo);
	}

	@Override
	public void modificaProducto(int codigo, producto producto) {
		// TODO Auto-generated method stub
		daoProducto.modificaProducto(codigo, producto);
	}

	@Override
	public ArrayList<producto> listaProductos() {
		// TODO Auto-generated method stub
		return daoProducto.listaProductos();
	}
	//implementar 

}
