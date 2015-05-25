package testsrc.service;
import model.Student;  
import org.junit.Before;  
import org.junit.Test;  

import service.StudentManager;
  
public class StudentManagerTest {  
    StudentManager manager;  
    @Before  
    public void init(){  
        manager=new StudentManager();  
    }  
    @Test public void testSave() {  
        Student stu1=new Student();  
        stu1.setName("John woo");  
        manager.save(stu1);  
    }  
    @Test public void testGet(){  
        Student stu=manager.get(12);  
        System.out.println(stu.getName());  
    }  
    @Test public void testUpdate(){  
        manager.update("Mary","Nie");  
    }  
    @Test public void testDelete(){  
        manager.delete("ie");  
    }  
}  