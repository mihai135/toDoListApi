package org.fasttrackit.service;

import org.fasttrackit.domain.ToDoItem;
import org.fasttrackit.persistence.ToDoItemRepository;
import org.fasttrackit.transfer.SaveToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {

    private ToDoItemRepository toDoItemRepository = new ToDoItemRepository();

    public void createToDoItem(SaveToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating item: " + request);
        toDoItemRepository.createToDoItem(request);
    }

    //ideally we would return a DTO
    public List<ToDoItem> getToDoItems() throws SQLException, IOException, ClassNotFoundException {
        System.out.println("getting to do items");
        return toDoItemRepository.getToDoItems();
    }

    public void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("deleting to do item " + id);
        System.out.println("deleted to do item " + id);
        toDoItemRepository.deleteToDoItem(id);
    }
}
