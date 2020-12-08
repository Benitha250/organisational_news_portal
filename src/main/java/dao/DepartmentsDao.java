package dao;

import models.Departments;
import models.News;
import models.Users;

import java.util.List;

public interface DepartmentsDao {

    //create
    void addDepartment(Departments department);
    void addUserInDepartment(Users user, Departments department);
    //read

    List<Departments> getAll();
    Departments findById(int id);
    List<Users> getAllUsersInDepartment(int department_id);
    List<News> getDepartmentNews(int id);
    //update
    //delete
    void clearAll();

}
