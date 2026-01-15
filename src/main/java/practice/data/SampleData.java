package practice.data;

import java.time.LocalDate;
import java.util.List;

/**
 * 学習用サンプルデータを提供するクラス
 */
public class SampleData {

    /**
     * 従業員リストを取得
     */
    public static List<Employee> getEmployees() {
        return List.of(
            new Employee(1, "田中太郎", "開発", 28, 450000, LocalDate.of(2020, 4, 1), true),
            new Employee(2, "佐藤花子", "営業", 35, 520000, LocalDate.of(2015, 4, 1), true),
            new Employee(3, "鈴木一郎", "開発", 42, 680000, LocalDate.of(2008, 10, 1), true),
            new Employee(4, "高橋美咲", "人事", 26, 380000, LocalDate.of(2022, 4, 1), true),
            new Employee(5, "伊藤健太", "開発", 31, 550000, LocalDate.of(2018, 7, 1), true),
            new Employee(6, "渡辺裕子", "営業", 29, 480000, LocalDate.of(2019, 4, 1), false),
            new Employee(7, "山本修司", "経理", 45, 620000, LocalDate.of(2005, 4, 1), true),
            new Employee(8, "中村あかり", "開発", 24, 350000, LocalDate.of(2024, 4, 1), true),
            new Employee(9, "小林大輔", "営業", 38, 580000, LocalDate.of(2012, 9, 1), true),
            new Employee(10, "加藤恵", "人事", 33, 490000, LocalDate.of(2016, 4, 1), true)
        );
    }

    /**
     * 部署リストを取得
     */
    public static List<String> getDepartments() {
        return List.of("開発", "営業", "人事", "経理", "総務");
    }

    /**
     * 数値リストを取得（基本的な操作練習用）
     */
    public static List<Integer> getNumbers() {
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30);
    }

    /**
     * 文字列リストを取得
     */
    public static List<String> getWords() {
        return List.of(
            "apple", "banana", "cherry", "date", "elderberry",
            "fig", "grape", "honeydew", "kiwi", "lemon"
        );
    }
}
