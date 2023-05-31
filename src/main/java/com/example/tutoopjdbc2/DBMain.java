package com.example.tutoopjdbc2;

import com.example.tutoopjdbc2.model.BaseDAO;
import com.example.tutoopjdbc2.model.Person;
import com.example.tutoopjdbc2.model.PersonDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println(personDAO.insertPerson("leo"));
        System.out.println(personDAO.insertPerson("yui"));
        List<Person> personsList = personDAO.findAllPerson();
        System.out.println(personsList.toString());
        System.out.println(personDAO.findByNamePerson("bab"));
    }
}
