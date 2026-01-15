package practice;

import practice.data.Employee;
import practice.data.SampleData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Lambda式とStream APIの練習問題
 * 
 * 各テストメソッド内のnullやコメント部分を実装してください。
 * テストが通れば正解です。
 */
class StreamPracticeTest {

    private List<Employee> employees;
    private List<Integer> numbers;
    private List<String> words;

    @BeforeEach
    void setUp() {
        employees = SampleData.getEmployees();
        numbers = SampleData.getNumbers();
        words = SampleData.getWords();
    }

    // ========================================
    // 基本編: filter, map, forEach
    // ========================================
    @Nested
    @DisplayName("Level 1: 基本操作")
    class BasicOperations {

        @Test
        @DisplayName("1-1: 偶数のみを抽出する")
        void filterEvenNumbers() {
            // TODO: numbersから偶数のみを抽出してリストにする
            List<Integer> result = null; // ここを実装

            assertEquals(List.of(2, 4, 6, 8, 10, 20, 30), result);
        }

        @Test
        @DisplayName("1-2: 全ての数値を2倍にする")
        void doubleNumbers() {
            // TODO: numbersの各要素を2倍にしたリストを作成
            List<Integer> result = null; // ここを実装

            assertEquals(List.of(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 30, 40, 50, 60), result);
        }

        @Test
        @DisplayName("1-3: 文字列を大文字に変換する")
        void toUpperCase() {
            // TODO: wordsの各要素を大文字に変換したリストを作成
            List<String> result = null; // ここを実装

            assertEquals(List.of("APPLE", "BANANA", "CHERRY", "DATE", "ELDERBERRY",
                                 "FIG", "GRAPE", "HONEYDEW", "KIWI", "LEMON"), result);
        }

        @Test
        @DisplayName("1-4: 5文字以上の単語を抽出する")
        void filterLongWords() {
            // TODO: wordsから5文字以上の単語のみを抽出
            List<String> result = null; // ここを実装

            assertEquals(List.of("apple", "banana", "cherry", "elderberry",
                                 "grape", "honeydew", "lemon"), result);
        }

        @Test
        @DisplayName("1-5: 従業員の名前一覧を取得する")
        void getEmployeeNames() {
            // TODO: employeesから名前のみを抽出してリストにする
            List<String> result = null; // ここを実装

            assertEquals(List.of("田中太郎", "佐藤花子", "鈴木一郎", "高橋美咲", "伊藤健太",
                                 "渡辺裕子", "山本修司", "中村あかり", "小林大輔", "加藤恵"), result);
        }
    }

    // ========================================
    // 中級編: sorted, distinct, limit, skip
    // ========================================
    @Nested
    @DisplayName("Level 2: 中間操作")
    class IntermediateOperations {

        @Test
        @DisplayName("2-1: 数値を降順でソートする")
        void sortDescending() {
            // TODO: numbersを降順でソートしたリストを作成
            List<Integer> result = null; // ここを実装

            assertEquals(List.of(30, 25, 20, 15, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1), result);
        }

        @Test
        @DisplayName("2-2: 給与が高い順に上位3名を取得する")
        void top3BySalary() {
            // TODO: 給与の高い順に並べ、上位3名の名前を取得
            List<String> result = null; // ここを実装

            assertEquals(List.of("鈴木一郎", "山本修司", "小林大輔"), result);
        }

        @Test
        @DisplayName("2-3: 開発部の従業員を年齢順に取得する")
        void devEmployeesByAge() {
            // TODO: 開発部の従業員を年齢の若い順に並べ、名前を取得
            List<String> result = null; // ここを実装

            assertEquals(List.of("中村あかり", "田中太郎", "伊藤健太", "鈴木一郎"), result);
        }

        @Test
        @DisplayName("2-4: 重複を除いた部署一覧を取得する")
        void distinctDepartments() {
            // TODO: employeesから部署名を抽出し、重複を除いてリストにする
            List<String> result = null; // ここを実装

            // 順序は問わないのでcontainsAllでチェック
            assertEquals(4, result.size());
            assertTrue(result.containsAll(List.of("開発", "営業", "人事", "経理")));
        }
    }

    // ========================================
    // 上級編: reduce, collect, groupingBy
    // ========================================
    @Nested
    @DisplayName("Level 3: 集約操作")
    class AggregateOperations {

        @Test
        @DisplayName("3-1: 数値の合計を計算する")
        void sumNumbers() {
            // TODO: numbersの合計を計算（reduceを使用）
            int result = 0; // ここを実装

            assertEquals(140, result);
        }

        @Test
        @DisplayName("3-2: 全従業員の平均給与を計算する")
        void averageSalary() {
            // TODO: employeesの平均給与を計算
            double result = 0; // ここを実装

            assertEquals(510000.0, result, 0.01);
        }

        @Test
        @DisplayName("3-3: 部署ごとに従業員をグループ化する")
        void groupByDepartment() {
            // TODO: 部署ごとに従業員リストをグループ化したMapを作成
            Map<String, List<Employee>> result = null; // ここを実装

            assertEquals(4, result.size());
            assertEquals(4, result.get("開発").size());
            assertEquals(3, result.get("営業").size());
            assertEquals(2, result.get("人事").size());
            assertEquals(1, result.get("経理").size());
        }

        @Test
        @DisplayName("3-4: 部署ごとの平均給与を計算する")
        void averageSalaryByDepartment() {
            // TODO: 部署ごとの平均給与をMapで取得
            Map<String, Double> result = null; // ここを実装

            assertEquals(507500.0, result.get("開発"), 0.01);
            assertEquals(526666.67, result.get("営業"), 0.01);
            assertEquals(435000.0, result.get("人事"), 0.01);
            assertEquals(620000.0, result.get("経理"), 0.01);
        }

        @Test
        @DisplayName("3-5: 最も給与の高い従業員を取得する")
        void highestPaidEmployee() {
            // TODO: 最も給与の高い従業員を取得（Optional使用）
            Optional<Employee> result = Optional.empty(); // ここを実装

            assertTrue(result.isPresent());
            assertEquals("鈴木一郎", result.get().name());
        }
    }

    // ========================================
    // 応用編: 複合条件
    // ========================================
    @Nested
    @DisplayName("Level 4: 応用問題")
    class AdvancedOperations {

        @Test
        @DisplayName("4-1: 30歳以上の開発部員の名前をカンマ区切りで結合する")
        void joinSeniorDevNames() {
            // TODO: 30歳以上の開発部従業員の名前をカンマで結合した文字列を作成
            String result = null; // ここを実装

            assertEquals("鈴木一郎,伊藤健太", result);
        }

        @Test
        @DisplayName("4-2: アクティブな従業員の給与合計を計算する")
        void totalSalaryOfActiveEmployees() {
            // TODO: active=trueの従業員の給与合計を計算
            double result = 0; // ここを実装

            assertEquals(4620000.0, result, 0.01);
        }

        @Test
        @DisplayName("4-3: 各部署で最も給与の高い従業員を取得する")
        void highestPaidByDepartment() {
            // TODO: 部署ごとに最も給与の高い従業員を取得
            Map<String, Optional<Employee>> result = null; // ここを実装

            assertEquals("鈴木一郎", result.get("開発").get().name());
            assertEquals("小林大輔", result.get("営業").get().name());
            assertEquals("加藤恵", result.get("人事").get().name());
            assertEquals("山本修司", result.get("経理").get().name());
        }

        @Test
        @DisplayName("4-4: 給与が平均以上の従業員名を取得する")
        void aboveAverageSalary() {
            // TODO: 平均給与以上の従業員の名前をリストで取得
            // ヒント: 先に平均を計算してから使用
            List<String> result = null; // ここを実装

            assertEquals(List.of("佐藤花子", "鈴木一郎", "伊藤健太", "山本修司", "小林大輔"), result);
        }
    }
}
