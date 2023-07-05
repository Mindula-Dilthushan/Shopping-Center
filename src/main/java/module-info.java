module lk.ax.shoppingcenter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens lk.ax.shoppingcenter to javafx.fxml;
    exports lk.ax.shoppingcenter;
}
