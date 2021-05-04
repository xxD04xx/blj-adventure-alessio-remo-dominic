package sample;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.ArrayList;

public class Controller {
    private static Color DOOR_COLOR;
    
    @FXML
    private Label labelLocation;

    @FXML
    private Label labelHealth;

    @FXML
    private Button button1;

    @FXML
    private Button button7;

    @FXML
    private Button button6;

    @FXML
    private Button button3;

    @FXML
    private Button button5;

    @FXML
    private Button button4;

    @FXML
    private Button button2;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private ListView<?> logText;

    @FXML
    private Label labelBalcony;

    @FXML
    private Label labelLivingroom;

    @FXML
    private Label labelBathroom;

    @FXML
    private Label labelGym;

    @FXML
    private Label labelToilet;

    @FXML
    private Label labelStoreroom;

    @FXML
    private Label labelBedroom;

    @FXML
    private Label labelKitchen;

    @FXML
    private Label labelSecretroom;

    @FXML
    private Label labelOffice;

    @FXML
    void button1Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button2Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button3Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button4Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button5Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button6Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button7Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button8Pressed(ActionEvent event) {
        System.out.println("test");
    }

    @FXML
    void button9Pressed(ActionEvent event) {
        System.out.println("test");
    }

    public Controller() {
        this.DOOR_COLOR = Color.RED;
    }

    public static Group doors(Group root) {
        ArrayList<Line> doors = new ArrayList<>();

        for (int i = 500; i < 701; i += 200) {
            Line door = new Line(i, 120, i, 180);
            doors.add(door);
        }
        for (int i = 300; i < 701; i += 200) {
            Line door = new Line(i, 220, i, 280);
            doors.add(door);
        }
        for (int i = 300; i < 701; i += 200) {
            Line door = new Line(i, 320, i, 380);
            doors.add(door);
        }
        for (int i = 700; i < 701; i += 200) {
            Line door = new Line(i, 420, i, 480);
            doors.add(door);
        }

        for (int i = 150; i < 800; i += 100) {
            Line door = new Line(i, 300, i += 100, 300);
            doors.add(door);
        }
        for (int i = 350; i < 800; i += 100) {
            Line door = new Line(i, 200, i += 100, 200);
            doors.add(door);
        }
        for (int i = 350; i < 800; i += 300) {
            Line door = new Line(i, 400, i += 100, 400);
            doors.add(door);
        }
        for (Line door : doors) {
            door.setStroke(Color.RED);
            door.setStrokeWidth(10);
            root.getChildren().add(door);
        }
        return root;
    }

    public static Group roomNames(Group root) {
        String[] roomName = new String[]{"", "Bathroom", "Storeroom", "", "Balcony",
                "Livingroom", "Bedroom", "Toilet", "Balcony", "Livingroom", "Bedroom", "Secretroom",
                "Balcony", "Gym", "Kitchen", "Office"};

        int koordinate = 150;
        int roomList = 0;
        for (int x = 0; x < 4; x++) {
            for (int i = 150; i < 500; i += 100) {
                Text t = new Text(koordinate, i, roomName[roomList]);
                t.setFont(new Font(20));
                t.setStroke(Color.TAN);
                root.getChildren().add(t);
                ++roomList;
            }
            koordinate = koordinate + 200;
        }
        return root;
    }

    public static Group lines(Group root) {
        ArrayList<Line> lines = new ArrayList<>();
        for (int i = 100; i < 600; i += 100) {
            Line lineHorizontal = new Line(100, i, 900, i);
            lineHorizontal.setStroke(Color.BLACK);
            lineHorizontal.setStrokeWidth(2);
            lines.add(lineHorizontal);
        }
        for (int i = 100; i < 1100; i += 200) {
            Line lineWagrecht = new Line(i, 100, i, 500);
            lineWagrecht.setStroke(Color.BLACK);
            lineWagrecht.setStrokeWidth(2);
            lines.add(lineWagrecht);
        }
        root.getChildren().addAll(lines);

        return root;
    }

    public static Color getDoorColor() {
        return DOOR_COLOR;
    }
}
