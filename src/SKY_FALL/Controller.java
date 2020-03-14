
package SKY_FALL;


import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color; 


public class Controller implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button PlayBtn,ExitBtn,HowtoPlayBtn;
    @FXML 
    private Button MainMenuBtn,MainMenuBtn1;
    @FXML
    public void play(ActionEvent event)throws Exception{ //chuyen sang PlayScene khi 
        Stage stage;                                     // an nut Play
        stage= (Stage) PlayBtn.getScene().getWindow();
        Parent PlayLayout=FXMLLoader.load(getClass().getResource("PlayLayout.fxml"));
        Scene PlayScene=new Scene(PlayLayout);
        stage.setScene(PlayScene);
        stage.show();
    }
    @FXML
    public void howtoPlay(ActionEvent event)throws  Exception{
        Stage stage;
        stage=(Stage) HowtoPlayBtn.getScene().getWindow();
        Parent HowtoPlayLayout=FXMLLoader.load(getClass().getResource("HowtoPlayLayout.fxml"));
       Text text=new Text(); 
       text.setFont(Font.font("Corbel Light", FontWeight.BOLD, FontPosture.REGULAR, 38)); 
       text.setFill(Color.BLACK);
       text.setText("\nHướng dẫn chơi\n"  +
"-Mục tiêu: Phá hủy tất cả máy bay  của đối thủ\n" +
"- Khi bắt đầu trò chơi, Người chơi có thể lựa chọn các loại máy bay sẽ sử dụng và sắp xếp "
               + "\nchúng trên PlayBoard của mình. \n" +
"-Tại mỗi lượt chơi, Người chơi có thể lựa chọn di chuyển các máy bay (mỗi lần di chuyển\n"+
               "khoảng cách 1 ô theo hướng đã đặt trên PlayBoard của mình), hoặc lựa chọn bắn lên\n"+
               "PlayBoard của đối thủ bằng cách click vào ô tương ứng trên PlayBoard đối thủ với 1 trong\n"+
               "3 loại đạn:\n" +
" +) Đạn thường (Số lượng: không giới hạn): Gây ra 100 damage tại ví trí bắn.\n" +
" +) Đạn tỏa (Số lượng: 5)                : Gây ra 50 damage tại vị trí bắn và 8 ô xung quanh.\n" +
" +) Đạn nổ (Số lượng: 1)                 :  Ngay lập tức tiêu diệt máy bay địch nếu bắn trúng.\n" +
"");
       
        Group root=new Group(HowtoPlayLayout,text);
        Scene HowtoPlayScene=new Scene(root);
        HowtoPlayScene.getStylesheets().add(getClass().getResource("view.css").toExternalForm());
        stage.setScene(HowtoPlayScene);
        stage.show();
    }   
    
  
    @FXML
    public void exit(ActionEvent event)throws Exception{ //hien ra alert confirmation 
       Stage stage;                                      // khi an nut exit
       stage=(Stage) ExitBtn.getScene().getWindow();
       ButtonType ExitYesBtn=new ButtonType("Yes");
       ButtonType ExitNoBtn=new ButtonType("No");
      
       Alert ExitAlert=new Alert(Alert.AlertType.CONFIRMATION);
       ExitAlert.setTitle("Exit Confirmation");
       ExitAlert.setHeaderText("Do you really want to exit now?");
       ExitAlert.getButtonTypes().setAll(ExitYesBtn,ExitNoBtn);
        
        Optional<ButtonType> ExitAlertResult=ExitAlert.showAndWait();
        if (ExitAlertResult.get()==ExitYesBtn) stage.close();    
    }
    
    
     @FXML
    public void backToMainMenu(ActionEvent event)throws Exception{
        // chuyen ve MainMenuScene khi an nut Main Menu
         Stage stage;
         stage= (Stage) MainMenuBtn.getScene().getWindow();
         Parent MainMenuLayout=FXMLLoader.load(getClass().getResource("MainMenuLayout.fxml"));
         Scene MainMenuScene= new Scene(MainMenuLayout);
         MainMenuScene.getStylesheets().add(getClass().getResource("view.css").toExternalForm());
         stage.setScene(MainMenuScene);
         stage.show();
    }
     @FXML
    public void backToMainMenu1(ActionEvent event)throws Exception{
        // chuyen ve MainMenuScene khi an nut Main Menu
         Stage stage;
         stage= (Stage) MainMenuBtn1.getScene().getWindow();
         Parent MainMenuLayout=FXMLLoader.load(getClass().getResource("MainMenuLayout.fxml"));
         Scene MainMenuScene= new Scene(MainMenuLayout);
         MainMenuScene.getStylesheets().add(getClass().getResource("view.css").toExternalForm());
         stage.setScene(MainMenuScene);
         stage.show();
    }
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
