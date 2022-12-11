package cntnt;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Main extends Application {

    public static final int WINDOW_WIDTH = 1200, WINDOW_HEIGHT = 860, TICK_TIME = 16, AGENT_SIZE = 5, AGENT_NUMBER = 10000;
    public static double TRAIL_DURATION = 0.3, AGENT_SPEED = 0.3, AGENT_TURN_SPEED = 0.5;

    Pane root;

    private Parent createContent(){
        root = new Pane();

        Controller con = new Controller();
        root.getChildren().add(con.th.visible);

        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        return root;
    }

    @Override
    public void start(Stage primaryStage){

        primaryStage.setTitle("SlimeSim");
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.setHeight(WINDOW_HEIGHT + 40);
        primaryStage.setWidth(WINDOW_WIDTH + 20);
        primaryStage.show();


        primaryStage.addEventHandler(KeyEvent.KEY_PRESSED, e -> {


            if(e.getCode() == KeyCode.UP){
                AGENT_TURN_SPEED += 0.1;
                System.out.println("Trun speed " + new DecimalFormat("#.##").format(AGENT_TURN_SPEED));
            }else if(e.getCode() == KeyCode.DOWN){
                AGENT_TURN_SPEED -= 0.1;
                System.out.println("Trun speed " + new DecimalFormat("#.##").format(AGENT_TURN_SPEED));
            }

            if(e.getCode() == KeyCode.LEFT){
                TRAIL_DURATION += 0.1;
                System.out.println("Trail duration " + new DecimalFormat("#.##").format(TRAIL_DURATION));
            }else if(e.getCode() == KeyCode.RIGHT){
                TRAIL_DURATION -= 0.1;
                System.out.println("Trail duration " + new DecimalFormat("#.##").format(TRAIL_DURATION));
            }

        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
