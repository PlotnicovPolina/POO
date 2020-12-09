package com;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    public static void main(String[] args) {
	Application.launch();
    }
    @Override
    public void start(Stage primaryStage) throws UnluckyException {
        TextField numerator =new TextField();
        Label mistakeNum = new Label("");
        TextField denominator =new TextField("");
        Label mistakeDen = new Label("");
        Button btn = new Button("Result");
        Label result =new Label("Result");

        TilePane tilepane = new TilePane(Orientation.VERTICAL,numerator,mistakeNum,denominator,mistakeDen,result,btn);

        btn.setOnAction(new EventHandler<ActionEvent>() {

           @Override
            public void handle(ActionEvent event) {
               String num=numerator.getText();
               String den=denominator.getText();
               String mn="";
               String md="";
               result.setText("Result");

               try{
                   Double.parseDouble(num);
               }
               catch (NumberFormatException e){
                   mn="Wrong input.";
               }
               try{
                   Double.parseDouble(den);
               }
               catch (NumberFormatException e){
                   md="Wrong input.";
               }

               for(int i = 0; i <num.length(); ++i) {
                   char n = num.charAt(i);
                   if((n<'0'|| n>'9')&&n!='.'){
                       mn="The input have to contain only digits and/or point.";
                   }
               }
               for(int i = 0; i <den.length(); ++i) {
                   char n = den.charAt(i);
                   if (den.equals("13")) {try {
                       throw new UnluckyException("Denominator don't have to contain 13");

                   } catch (UnluckyException e) {
                       e.printStackTrace();
                   }
                   md = "Denominator don't have to contain 13";
                    }
                   else if (den.equals("0")){
                       md="Denominator don't have to contain 0";
                   }
                   else if((n<'0'|| n>'9')&&n!='.'){
                       md="The input have to contain only digits and/or point.";
                   }
               }
               if(mn.equals("") && md.equals("")){
                   double rsl= Double.parseDouble(num)/Double.parseDouble(den);
                   result.setText(String.valueOf(rsl));
               }
                   mistakeNum.setText(mn);
                   mistakeDen.setText(md);
            }
        });

        tilepane.setAlignment(Pos.CENTER);
        tilepane.setMinWidth(400);
        tilepane.setMinHeight(300);

        Group group=new Group();
        group.getChildren().addAll(tilepane);
        Scene scene= new Scene(group,400,300);
        primaryStage.setTitle("Lab №9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
