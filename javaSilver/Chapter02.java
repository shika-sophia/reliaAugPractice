/**
 * @title javaSilver / Chapter02
 * @content primitive, literal, var, String, StringBuilder
 * @see 志賀澄人『徹底攻略 Java SE11 Silver 問題集 黒本[1ZO-815]』インプレス, 2019
 * @date 2020-09-12 / 1900-2600
 * @correctRate ① 12.5 / 22 = 56.8％
 */
/*
 * 〇1. Cコンパイルエラー bool?
 * 〇2. E int e = 0827 -> 8進数の8はNG
 * 〇3. C _123, D 789_, E 3_.14, F 99_F, I. 0x_52
 * 〔p43〕java7～
 * 		◆数値リテラルの「_」区切り
 * 			・リテラルの先頭と末尾は不可
 * 			・記号の前後は不可
 *
 * ｘ4. D char d =null; -> 〇C char c = 89;
 * 〔p44〕
 * ◆charに代入できるもの
 * ・「'」で括った１文字
 * ・'\\uXXXX' <- \は１つ。Unicode16進数
 * ・0～65535(=16^4)の数値 Unicode10進数, 正数のみ
 * ◆nullは参照がないことを表す。値を格納する基本型(primitive)には代入不可。
 *
 * ｘ5. A $a, C _0 -> 〇D ${d}, E g.aは不可
 * ◆識別子 identifier
 *・予約語は不可
 *・記号は「_」「$」のみ。最初でも可
 *・数字は最初不可
 *・Unicode文字はＯＫ。ただし、「!@#^&*()';;[]/,.{}(バックスラッシュ)|」は不可。
 *
 * ｘ6. D var = d {1, 2, 3}; -> 〇 E var e = new ArrayList<>();は可。
 * 〔p47〕
 * ◆ var 型推論 [JavaSE10～]
 * ・配列は型宣言で配列インスタンスを生成し、要素を初期化。varだとインスタンスできない。
 * ・<>は特定できないときは<Object>に決まる。
 * ・varはローカル変数のみ。フィールドは不可。
 * ・仮引数の型宣言は不可。
 * ・ラムダ式は不可。
 * ・型推論はコンパイル時。
 *
 * 〇7. C.コンパイルエラー var value;の型を類推不可。
 * ×8. D Bが表示。var a = new B(); => 〇 A コンパイルエラー
 * 〔p49〕BクラスとCクラスに互換性がなく、B型の変数に C型のインスタンスは代入不可。
 *
 * △9. 〇B String b = "sample";, ×存在しないC String.newInstance("sample");
 * 		 => 〇 A String a = new String("sample");
 * ×10. B Hello, worldと表示 => 〇 A hoge, world
 * 〔p51〕
 * mutable: 可変なオブジェクト。一度セットしたフィールド値を変更できる。
 * immutable: 不変なオブジェクト。 java.lang.String, java.lang.File
 *
 * Stringの変更を反映させるには新しいインスタンスを作る。replaceAll()では変更不可。
 *
 * 〇11. F 実行時に例外。charAt(5)にあたる文字がない。
 * 〇12. E -1
 * ×13. B => D
 * ×14. A baa => C
 * 〇15. F 実行時に例外。str.length()== 5なので、charAt(5)となる。
 * 〇16. A true
 * ×17. D "Hello,".plus("Java!") => A
 * 〇18. C 303040
 * ×19. A null => B
 * 〇20. D 21?
 * 〇21. D eaba?
 * 〇22. A 1
 *  */
package javaSilver;

public class Chapter02 {

    public static void main(String[] args) {


    }//main()

}//class
