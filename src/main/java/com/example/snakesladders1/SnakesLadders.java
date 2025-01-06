package com.example.snakesladders1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class SnakesLadders extends Application {
    public static final int tileSize=40,width=10,height=10;
    private static final int buttonLine = 420; // Y position for buttons
    private static final int infoLine = 470;  // Y position for info labels

    private Pane createContent(){
        Pane root=new Pane();
        root.setPrefSize(width*tileSize,height*tileSize+150);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Tile tile=new Tile(tileSize);
                root.getChildren().add(tile);
                tile.setTranslateX(j*tileSize);
                tile.setTranslateY(i*tileSize);
            }
        }

        Image img=new Image("C:\\Users\\neeti\\IdeaProjects\\snakesladders1\\src\\main\\img_1.png");
        ImageView board=new ImageView();
        board.setImage(img);
        board.setFitHeight(height*tileSize);
        board.setFitWidth(width*tileSize);
        root.getChildren().add(board);
        //Buttons
        Button player1Btn=new Button("Player 1");
        Button player2Btn=new Button("Player 2");
        Button startBtn=new Button("Start");
        player1Btn.setTranslateY(buttonLine);
        player1Btn.setTranslateX(20);
        player2Btn.setTranslateY(buttonLine);
        player2Btn.setTranslateX(300);
        startBtn.setTranslateY(buttonLine);
        startBtn.setTranslateX(180);
        //Info display
        Label player1Label =new Label("Your Turn1 P1");
        Label player2Label=new Label("Your Turn P2");
        Label diceLabel=new Label("Start the Game");

        player1Label.setTranslateY(infoLine);
        player1Label.setTranslateX(20);
        player2Label.setTranslateY(infoLine);
        player2Label.setTranslateX(300);
        diceLabel.setTranslateY(infoLine);
        diceLabel.setTranslateX(150);

        root.getChildren().addAll(
                player1Btn,player2Btn,startBtn,
                player1Label,player2Label,diceLabel);
        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(SnakesLadders.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(createContent()); //fxmlLoader.load()
        stage.setTitle("Snakes & Ladders");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}