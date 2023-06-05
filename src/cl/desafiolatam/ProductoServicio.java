package cl.desafiolatam;

import java.util.ArrayList;

public class ProductoServicio {
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	public void listarProductos () {
		for (Producto producto: listaProductos) {
			System.out.println(producto.toString());
		}
	}
	public void agregarProductos(Producto producto) {
		listaProductos.add(producto);
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + listaProductos + "]";
	}
	
	

}

