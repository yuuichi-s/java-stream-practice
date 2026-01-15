package practice.data;

import java.time.LocalDate;

/**
 * 従業員を表すレコード
 */
public record Employee(
    int id,
    String name,
    String department,
    int age,
    double salary,
    LocalDate hireDate,
    boolean active
) {
    /**
     * 勤続年数を計算
     */
    public int yearsOfService() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }
}
