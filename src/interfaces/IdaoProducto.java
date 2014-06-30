package interfaces;

import java.util.ArrayList;

import entidades.producto;

public interface IdaoProducto {

	public void agreProducto(producto producto);
	public void eliminarProducto(int codigo);
	public void modificaProducto(int codigo , producto producto);
	
	public ArrayList<producto> listaProductos();
}
