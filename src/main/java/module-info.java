module com.example.huffman_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.huffman_project to javafx.fxml;
    exports com.example.huffman_project;
}