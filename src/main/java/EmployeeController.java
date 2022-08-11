import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String name,@RequestParam("lastName")String surname){
        return employeeService.addEmployee(name,surname);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("firstName") String name,@RequestParam("lastName") String surname){
        return employeeService.findEmployee(name,surname);
    }
    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("firstName") String name,@RequestParam("lastName") String surname){
        return employeeService.removeEmployee(name,surname);
    }
}
