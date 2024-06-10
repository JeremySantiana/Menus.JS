package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class InterfazMenus extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        MenuBar barraDeMenu = crearBarraDeMenu();

        
        BorderPane contenedorPrincipal = new BorderPane();
        contenedorPrincipal.setTop(barraDeMenu);

   
        Scene escena = new Scene(contenedorPrincipal, 800, 600);
        primaryStage.setScene(escena);
        primaryStage.setTitle("Menú en JavaFX");
        primaryStage.show();
    }

    private MenuBar crearBarraDeMenu() {
        MenuBar menuBar = new MenuBar();

   
        Menu menuArchivo = new Menu("Archivo");
        Menu menuEditar = new Menu("Editar");
        Menu menuAyuda = new Menu("Ayuda");

       
        menuArchivo.getItems().addAll(
            crearMenuItem("Nuevo", "Nuevo archivo"),
            crearMenuItem("Abrir", "Abrir archivo"),
            crearMenuItem("Guardar", "Guardar archivo"),
            new SeparatorMenuItem(),
            crearMenuItem("Salir", "Salir de la aplicación")
        );


        menuEditar.getItems().addAll(
            crearMenuItem("Cortar", "Cortar"),
            crearMenuItem("Copiar", "Copiar"),
            crearMenuItem("Pegar", "Pegar")
        );

     
        menuAyuda.getItems().add(
            crearMenuItem("Acerca de", "Acerca de esta aplicación")
        );


        menuBar.getMenus().addAll(menuArchivo, menuEditar, menuAyuda);

        return menuBar;
    }

    private MenuItem crearMenuItem(String nombre, String mensaje) {
        MenuItem item = new MenuItem(nombre);
        item.setOnAction(e -> System.out.println(mensaje));
        return item;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
