package com.demo.rest;

import com.demo.model.Employee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @GET
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Sonu"));
        list.add(new Employee(102, "Monu"));
        list.add(new Employee(103, "Tonu"));
        return list;
    }

    @GET
    @Path("/{id}")
    public Employee getEmployeeById(@PathParam("id") int id) {
        return new Employee(id, "DemoEmployee");
    }
}
