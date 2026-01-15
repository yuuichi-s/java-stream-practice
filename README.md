# JavaのLambda式とStream APIの練習問題集

## 概要

このプロジェクトは、JUnitテスト形式の練習問題を解くことでStream APIの使い方を身につけることを目的としています。テストコード内の `null` 部分を実装し、テストが通れば正解です。

従業員データを使った実務に近い例題を通じて、filter、map、sorted、groupingByなど、よく使うStream操作を段階的に学習できます。

## 対象者

- Java基礎文法を習得済みの方
- Stream APIをこれから学びたい方
- Streamの使い方を実践形式で練習したい方

## 必要な環境

- JDK 17以上
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)（推奨）

※ IntelliJ IDEAにはMavenが内蔵されているため、別途Mavenをインストールする必要はありません。

## セットアップ手順（IntelliJ IDEA）

### 1. リポジトリをクローン

```bash
git clone https://github.com/your-username/java-stream-practice.git
```

または、GitHubからZIPをダウンロードして展開してください。

### 2. IntelliJ IDEAでプロジェクトを開く

1. IntelliJ IDEAを起動
2. プロジェクトの`開く` を選択
3. クローンしたフォルダ（`java-stream-practice`）を選択して `OK`
4. 「Trust Project」を選択
5. Mavenの依存関係が自動的にダウンロードされます（右下に進捗が表示されます）

### 3. JDKの確認

依存関係のダウンロード完了後、JDKが設定されていない場合は以下の手順で設定してください。

1. `ファイル` → `プロジェクト構造` を開く
2. `プロジェクト` → `SDK` でJDK 17以上を選択
3. `OK`

## 練習問題の構成

全16問が4つのレベルに分かれています。

| レベル | 内容 | 学習する操作 |
|--------|------|--------------|
| Level 1 | 基本操作（5問） | filter, map, collect |
| Level 2 | 中間操作（4問） | sorted, distinct, limit, skip |
| Level 3 | 集約操作（5問） | reduce, average, groupingBy, max |
| Level 4 | 応用問題（4問） | 複合条件、複数操作の組み合わせ |

## 使い方

### 練習問題を解く

1. `src/test/java/practice/StreamPracticeTest.java` を開く
2. 各テストメソッド内の `null` や `0` の部分をStream APIを使って実装
3. テストを実行して結果を確認

### テストの実行方法

**個別のテストを実行する場合：**
- テストメソッドの左側にある緑の再生ボタンをクリック

**レベルごとにまとめて実行する場合：**
- ネストしたクラス（`BasicOperations` など）の左側にある再生ボタンをクリック

**全テストを実行する場合：**
- `StreamPracticeTest` クラスの左側にある再生ボタンをクリック
- または `Ctrl + Shift + F10`（Windows）でクラス全体を実行

### 解答例

最初のうちは難しいかもしれません。以下は Level 1 の1問目の解答例です。

```java
@Test
@DisplayName("1-1: 偶数のみを抽出する")
void filterEvenNumbers() {
    List<Integer> result = numbers.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

    assertEquals(List.of(2, 4, 6, 8, 10, 20, 30), result);
}
```

## プロジェクト構成

```
java-stream-practice/
├── pom.xml
├── README.md
└── src/
    ├── main/java/practice/data/
    │   ├── Employee.java      # 従業員データのレコード
    │   └── SampleData.java    # サンプルデータ提供クラス
    └── test/java/practice/
        └── StreamPracticeTest.java  # 練習問題（ここを編集）
```
