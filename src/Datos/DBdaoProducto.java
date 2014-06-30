package Datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import android.database.SQLException;

import entidades.producto;
import interfaces.IdaoProducto;
public class DBdaoProducto implements IdaoProducto{

	private Connection connection = new conector().traerConeccion();
	@Override
	public void agreProducto(producto producto) {
		// TODO Auto-generated method stub
	
			
			try {
				CallableStatement agregar = connection.prepareCall("{call agregaPro(?,?,?)}");
				agregar.setString("nombre",producto.getNombre());
				agregar.setInt("cantidad",producto.getCantidad());
				agregar.setString("descripcion", producto.getDescripcion());
				agregar.executeUpdate();
			} catch (java.sql.SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}	
	
	@Override
	public void eliminarProducto(int codigo) {
		// TODO Auto-generated method stub
		try {
			CallableStatement eliminar = connection.prepareCall("{call eliminaPro(?,?,?)}");
			eliminar.setInt("codigo",codigo);
			eliminar.executeUpdate();
		} catch (java.sql.SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//eliminar.setString("codigo",producto.getcodigo());
	}

	@Override
	public void modificaProducto(int codigo, producto producto) {
		// TODO Auto-generated method stub
		try {
			CallableStatement modificar = connection.prepareCall("{call modificaPro(?,?,?)}");
			modificar.setInt("codigo",codigo);		
			modificar.setString("nombre",producto.getNombre());
			modificar.setInt("cantidad",producto.getCantidad());
			modificar.setString("descripcion", producto.getDescripcion());
			modificar.executeUpdate();
		} catch (java.sql.SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}	

	 

	@Override
	public ArrayList<producto> listaProductos() {
		// TODO Auto-generated method stub
		ArrayList<producto> productos = new ArrayList<producto>();
		try {
			CallableStatement listar = connection.prepareCall("{call listaPro()}");
			ResultSet resultado = listar.executeQuery();
			while(resultado.next()){
				producto producto = new producto();
				producto.setCodigo(resultado.getInt("codigo"));
				producto.setNombre(resultado.getString("nombre"));
				producto.setCantidad(resultado.getInt("cantidad"));
				producto.setDescripcion(resultado.getString("descripcion"));
			productos.add(producto);
				
			}
			return productos;
		} catch (java.sql.SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	
	}

}
