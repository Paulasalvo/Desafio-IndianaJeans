package cl.desafiolatam;

public class IndianaJeans {

	public static void main(String[] args) {
		Producto primero =  new Producto("jeans", "1500", "jeans bonito", "111", "42", "umbrella", "azul");
		Producto segundo =  new Producto("polera", "1000", "polera bonita", "222", "40", "nike", "blanca");
		
		ProductoServicio servicio = new ProductoServicio();
		servicio.agregarProductos(primero);
		servicio.agregarProductos(segundo);
		Menu menu = new Menu();
		
		
		ExportadorTxt exportador = new ExportadorTxt();
		exportador.exportar(servicio.getListaProductos());
		menu.menu(servicio, exportador);
	}
		

}
