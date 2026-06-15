package com.example.personapi.service;

import com.example.personapi.model.Person;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final List<Person> persons = new ArrayList<>();

    public PersonService() {

    
        Person p1 = new Person(1L, "John", "john@gmail.com", 25);
        p1.setMoney(50000);
        p1.setCity("London");
        p1.setProfession("Developer");
        p1.setActive(true);
        p1.setGender("Male");
        p1.setCr_dt(new Date());
    
        Person p2 = new Person(2L, "Alice", "alice@gmail.com", 30);
        p2.setMoney(75000);
        p2.setCity("Paris");
        p2.setProfession("Tester");
        p2.setActive(true);
        p2.setGender("Female");
        p2.setCr_dt(new Date());
    
        Person p3 = new Person(3L, "Bob", "bob@gmail.com", 22);
        p3.setMoney(25000);
        p3.setCity("Delhi");
        p3.setProfession("Developer");
        p3.setActive(false);
        p3.setGender("Male");
        p3.setCr_dt(new Date());
    
        Person p4 = new Person(4L, "Emma", "emma@gmail.com", 28);
        p4.setMoney(60000);
        p4.setCity("Mumbai");
        p4.setProfession("Manager");
        p4.setActive(true);
        p4.setGender("Female");
        p4.setCr_dt(new Date());
    
        Person p5 = new Person(5L, "David", "david@gmail.com", 35);
        p5.setMoney(90000);
        p5.setCity("Vadodara");
        p5.setProfession("Architect");
        p5.setActive(true);
        p5.setGender("Male");
        p5.setCr_dt(new Date());
    
        Person p6 = new Person(6L, "Sophia", "sophia@gmail.com", 24);
        p6.setMoney(45000);
        p6.setCity("London");
        p6.setProfession("Developer");
        p6.setActive(false);
        p6.setGender("Female");
        p6.setCr_dt(new Date());
    
        Person p7 = new Person(7L, "James", "james@gmail.com", 40);
        p7.setMoney(120000);
        p7.setCity("New York");
        p7.setProfession("Manager");
        p7.setActive(true);
        p7.setGender("Male");
        p7.setCr_dt(new Date());
    
        Person p8 = new Person(8L, "Olivia", "olivia@gmail.com", 27);
        p8.setMoney(55000);
        p8.setCity("Delhi");
        p8.setProfession("Designer");
        p8.setActive(true);
        p8.setGender("Female");
        p8.setCr_dt(new Date());
    
        Person p9 = new Person(9L, "Michael", "michael@gmail.com", 32);
        p9.setMoney(85000);
        p9.setCity("Paris");
        p9.setProfession("Developer");
        p9.setActive(false);
        p9.setGender("Male");
        p9.setCr_dt(new Date());
    
        Person p10 = new Person(10L, "Ava", "ava@gmail.com", 29);
        p10.setMoney(70000);
        p10.setCity("Vadodara");
        p10.setProfession("HR");
        p10.setActive(true);
        p10.setGender("Female");
        p10.setCr_dt(new Date());
    
        persons.addAll(Arrays.asList(
                p1, p2, p3, p4, p5,
                p6, p7, p8, p9, p10
        ));
    }

    public List<Person> fetchAll()
    {
        return this.persons;
    }

    public List<Person> getById(int id)
    {
        return this.persons.stream().filter(e -> e.getId() == id).collect(Collectors.toList());
    }

    public List<Person> getByName(String name)
    {
        return this.persons.stream().filter(e -> e.getName().toLowerCase().contains(name.toLowerCase()) == true).collect(Collectors.toList());
    }

    public Double getTotal()
    {
        return 500.0;
    }

    public List<String> getNameUpperCase()
    {
        return this.persons.stream().map(Person::getName).map(String::toUpperCase).collect(Collectors.toList());
    }

    public Map <String,Double> getCountCity()
    {
        Map <String,Double> mp = new HashMap<>();

        Double sum = 0.0;

        for (int i = 0 ; i < this.persons.size();i++)
        {
                sum += this.persons.get(i).getMoney();
        }

        mp.put("MONEY",sum);

        return mp;
    }

    public String Joined()
    {
        return this.persons.stream()
        .map(Object::toString)
        .collect(Collectors.joining(", "));
    }


}
