
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;

public class FXMainPane extends VBox

{

public void start(Stage stage)

{

HBox hh1=new HBox();

HBox hh2=new HBox();


DataManager Dobject=new DataManager();


TextField textFields = new TextField();


Label labelValue = new Label("FeedBack:");


Button One_Enter = new Button("Hello");


One_Enter.setOnAction(new EventHandler<ActionEvent>()

{

@Override public void handle(ActionEvent e)

{

textFields.setText(Dobject.getHello());

}

});

// howdy button

Button Two_Enter = new Button("Howdy");

//implement the button bb2

Two_Enter.setOnAction(new EventHandler<ActionEvent>()

{

@Override public void handle(ActionEvent e)

{

textFields.setText(Dobject.getHowdy());

}

});


Button Three_Enter = new Button("Chinese");


Three_Enter.setOnAction(new EventHandler<ActionEvent>()

{

@Override public void handle(ActionEvent e)

{

textFields.setText(Dobject.getChineese());

}

});


Button Four_Enter = new Button("Clear");


Four_Enter.setOnAction(new EventHandler<ActionEvent>()

{

@Override public void handle(ActionEvent e)

{

textFields.setText(" ");

}

});


Button Five_Enter = new Button("Exit");


Five_Enter.setOnAction(new EventHandler<ActionEvent>()

{

@Override public void handle(ActionEvent e)

{

System.exit(0);

}

});

//Instantiating the HBox class

VBox vBox =new VBox(50);

vBox.setAlignment(Pos.CENTER);

Insets inset=new Insets(20, 20, 20, 20);


vBox.setSpacing(10);

VBox.setMargin(textFields, new Insets(20, 20, 20, 20));


VBox.setMargin(One_Enter, new Insets(20, 20, 20, 20));


VBox.setMargin(Two_Enter, new Insets(20, 20, 20, 20));


VBox.setMargin(Three_Enter, new Insets(20, 20, 20, 20));


VBox.setMargin(Four_Enter, new Insets(20, 20, 20, 20));


VBox.setMargin(Five_Enter, new Insets(20, 20, 20, 20));

hh1.setAlignment(Pos.CENTER);

hh1.getChildren().addAll(labelValue,textFields,hh2);


ObservableList<Node> listVal = vBox.getChildren();


listVal.addAll(textFields, One_Enter,Two_Enter,Three_Enter,Four_Enter,Five_Enter,hh1);

Scene scenes = new Scene(vBox);


stage.setScene(scenes);



stage.show();

}

}