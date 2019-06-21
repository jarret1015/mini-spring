package site.jarret.service;

import site.jarret.beans.Bean;

/**
 * @author Jarret
 * @since 2019/06/21 16:18
 */
@Bean
public class SalaryService {
    public Integer calSalary(Integer experience) {
        if (experience != null) {
            return experience * 5000;
        }
        return 0;
    }
}
