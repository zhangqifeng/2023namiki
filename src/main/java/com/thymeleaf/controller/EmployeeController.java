package com.thymeleaf.controller;

import com.thymeleaf.entity.Employee;
import com.thymeleaf.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    private static final Logger log= LoggerFactory.getLogger(EmployeeController.class);

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("search")
    public String search(@Param("employee_id") Integer employee_id,
                         @Param("employee_name") String employee_name,
                         @Param("department") String department,
                         @Param("address") String address,Model model){
        List<Employee>employeeList=employeeService.search(employee_id,employee_name,department,address);
        model.addAttribute("employeeList",employeeList);
        return "emplist";
    }


    @RequestMapping("delete")
    public String delete(Integer employee_id){
        log.debug("删除的员工id:{}",employee_id);
        employeeService.delete(employee_id);
        return "redirect:/employee/lists";
    }
    @RequestMapping("update")
    public String update(Employee employee){
        log.debug("更新之后员工信息:社員番号:{},社員名:{},役職名:{},性別:{},部署名:{},住所:{},雇用形態:{},入社年月日:{}",employee.getEmployee_id(),employee.getEmployee_name(),employee.getJob_title()
                ,employee.getSex(),employee.getDepartment(),employee.getAddress(),employee.getEmployment_status(),employee.getHire_date());
        employeeService.update(employee);
        return "redirect:/employee/lists";
    }
    @RequestMapping("detail")
    public String detail(Integer employee_id,Model model){
        log.debug("当前查询员工id:{}",employee_id);
        Employee employee=employeeService.findById(employee_id);
        model.addAttribute("employee",employee);
        return "updateEmp";
    }

    @RequestMapping("save")
    public String save(Employee employee){
        log.debug("社員番号:{},社員名:{},役職名:{},性別:{},部署名:{},住所:{},雇用形態:{},入社年月日:{}",employee.getEmployee_id(),employee.getEmployee_name(),employee.getJob_title()
        ,employee.getSex(),employee.getDepartment(),employee.getAddress(),employee.getEmployment_status(),employee.getHire_date());
    employeeService.save(employee);
        return "redirect:/employee/lists";

    }

     @RequestMapping("lists")
    public String lists(Model model){
         log.debug("查询所有员工信息");
         List<Employee>employeeList= employeeService.lists();
         model.addAttribute("employeeList",employeeList);
         return "emplist";
     }


}