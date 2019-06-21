package site.jarret.controllers;

import site.jarret.beans.AutoWired;
import site.jarret.service.SalaryService;
import site.jarret.web.mvc.Controller;
import site.jarret.web.mvc.RequestMapping;
import site.jarret.web.mvc.RequestParam;

/**
 * @author Jarret
 * @since 2019/06/21 15:53
 */
@Controller
public class SalaryController {
    @AutoWired
    private SalaryService salaryService;

    @RequestMapping("/getSalary.json")
    public Integer getSalary(@RequestParam("name") String name, @RequestParam("experience") String experience) {
        if (experience == null || "".equals(experience)) {
            return 0;
        }
        return salaryService.calSalary(Integer.parseInt(experience));
    }
}
