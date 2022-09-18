package duke.gui;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * SideBarContainer is a container that contains the side bar to include the icons of different chatbot personalities.
 */
public class SideBarContainer extends VBox {
    private static final double SIDEBAR_WIDTH = 60.0;
    private static final double SIDEBAR_ICON_RADIUS = 25.0;
    private static final double SIDEBAR_INSET_VALUE = 5.0;
    private static final double SIDEBAR_SPACING_VALUE = 10.0;

    private final Circle sideBarIcon;
    private final Circle sideBarIcon2;

    /**
     * Creates a container to contain the side bar with different icons.
     */
    public SideBarContainer() {
        this.sideBarIcon = new Circle();
        this.sideBarIcon.setRadius(SIDEBAR_ICON_RADIUS);
        this.sideBarIcon.setFill(Color.ORANGERED);

        this.sideBarIcon2 = new Circle();
        this.sideBarIcon2.setRadius(SIDEBAR_ICON_RADIUS);
        this.sideBarIcon2.setFill(Color.DARKGREEN);

        this.getChildren().addAll(sideBarIcon, sideBarIcon2);

        this.setMinWidth(SIDEBAR_WIDTH);
        this.setMaxWidth(SIDEBAR_WIDTH);
        this.setPadding(new Insets(SIDEBAR_INSET_VALUE));
        this.setSpacing(SIDEBAR_SPACING_VALUE);
    }

    /**
     * Initialize the event handlers of the icons in the sidebar. When clicked on a particular icon,
     * the user will dialog will switch to that particular personality.
     */
    public void initializeEventHandlers() {
        // Dummy icon with flashing event
        this.sideBarIcon.setOnMouseClicked((event) -> {
            if (this.sideBarIcon.getFill().equals(Color.ORANGERED)) {
                this.sideBarIcon.setFill(Color.DARKRED);
            } else {
                this.sideBarIcon.setFill(Color.ORANGERED);
            }
        });

        // Dummy icon with flashing event
        this.sideBarIcon2.setOnMouseClicked((event) -> {
            if (this.sideBarIcon2.getFill().equals(Color.DARKGREEN)) {
                this.sideBarIcon2.setFill(Color.GREENYELLOW);
            } else {
                this.sideBarIcon2.setFill(Color.DARKGREEN);
            }
        });
    }
}
