/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sean Merkel
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TodoListManagerController {
///*
    @FXML
    public void addListButtonClicked(ActionEvent actionEvent) {
        // clear current page
        // ask for title of new list
        // create new list with the new title
    }

    @FXML
    public void removeListButtonClicked(ActionEvent actionEvent) {
        // clear current page
        // delete the title from the collection of todolist
        // return to previous todolist
    }

    @FXML
    public void editTitleButtonClicked(ActionEvent actionEvent) {
        // delete current title of todolist
        // ask for updated title from user
        // return the new title entered by the user
    }

    @FXML
    public void addItemButtonClicked(ActionEvent actionEvent) {
        // go to final item on list and open a new spot
        // ask user for due date and task description
        // create new item with information inputted from the user
        // place new item underneath previous item on screen
    }

    @FXML
    public void removeItemButtonClicked(ActionEvent actionEvent) {
        // clear current line containing item on screen
        // delete the item from the collection of todolist
        // move up to the item above
    }

    @FXML
    public void editDescriptionButtonClicked(ActionEvent actionEvent) {
        // clear current description
        // ask for description of new item
        // create new list with the new title
    }

    @FXML
    public void editDueDateButtonClicked(ActionEvent actionEvent) {
        // clear current due date
        // ask for due date of new item
        // create new list with the new title
    }

    @FXML
    public void markCompleteButtonClicked(ActionEvent actionEvent) {
        // go to item's boolean complete and make it true
        // fix screen to display checkmark under complete column
    }

    @FXML
    public void displayAllItemsButtonClicked(ActionEvent actionEvent) {
        // create a new screen
        // print every item
    }

    @FXML
    public void displayIncompleteItemsButtonClicked(ActionEvent actionEvent) {
        // go item by item to check if boolean complete is marked false
        // create a new screen
        // print every item marked false
    }

    @FXML
    public void displayCompleteItemsButtonClicked(ActionEvent actionEvent) {
        // go item by item to check if boolean complete is marked true
        // create a new screen
        // print every item marked true
    }

    @FXML
    public void saveItemsSingleListButtonClicked(ActionEvent actionEvent) {
        // save each item in the one list
        // research how to save in javafx
    }

    @FXML
    public void saveItemsAllListButtonClicked(ActionEvent actionEvent) {
        // save each item in the list
        // go to the next list and repeat process until every list is saved
    }

    @FXML
    public void loadSingleListButtonClicked(ActionEvent actionEvent) {
        // ask user for name of list they want
        // go one by one through all the todolist until a title matches the user's input
    }

    @FXML
    public void loadMultipleListsButtonClicked(ActionEvent actionEvent) {
        // ask user for name of list they want
        // go one by one through all the todolist until a title matches the user's input
        // repeat process until every list user has inputted has been found
    }

    public void addListLen() {
        // number of todolist should increase by one
    }

    public void subtractListLen() {
        // number of todolist should decrease by one
    }

    public void newTitleCheck() {
        // actual should equal the user's input for the title
    }

    public void addItemLen() {
        // number of todolistitem should increase by one
    }

    public void subtractItemLen() {
        // number of todolistitem should decrease by one
    }

    public void newDescriptionCheck() {
        // actual should equal the user's input for the description
    }

    public void newDueDateCheck() {
        // actual should equal the user's input for the due date
    }

    public void isCompleteCheck() {
        // check if the boolean complete in item is true
    }

    public void isIncompleteCheck(){
        // check if the boolean complete in item is false
    }

    public void loadTitle(){
        // check if the user's input equals the actual
    }

    public void loadMultipleTitles(){
        // check if every title in the user's input equals the actual
    }
//*/
}
