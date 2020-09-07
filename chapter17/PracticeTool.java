/**
 * @title chapter17 / Practice 17-1 ～ 17-5
 * @content package
 * @author Oshika
 * @date 2020-09-07 / 1500-1600
 */
package chapter17;
/*
//====== Practice 17-1 ======
(1) 〇 予約語package
(2) × public は別のクラスから利用可 -> このパッケージからも、どこからも利用可
(3) × サブpackageも取り込まれる
        -> サブはサブで指定すべし
(4) 〇 完全修飾名 java.lang.String;
(5) (2)に同じ

〔答え合わせ〕
メソッドがpublicでも、classがpublicでなければ、別パッケージからは使えません

(6) × java.ioには、java.lang.Objectの拡張クラスは含まれない
        -> java.lang.Objectの拡張って、全部のクラス当てはまるやんけ。
        -> 当然java.ioも含む。
(7) × コンストラクタは常にpublic -> privateのもある
(8) × privateに意味はない
        -> カプセル化とか、クラス相互依存を断つとか、いろいろ使うのよ
(9) 〇 同名packageを複数ファイルに書いても良い。


//====== Practice 17-2 ======
(1)import java.util.Random;
(2)import java.util.*;
 のみ正しい

//====== Practice 17-3 ======
(1)×import java.awt.*; -> サブパッケージimageは取り込んでくれない
(2)〇import java.awt.image.*;
(3)〇import java.awt.image.ImageFilter;

//====== Practice 17-4 ======
defaultパッケージ(無名パッケージ)
*/

//====== Practice 17-5 ======
//問 PasswordRegisterを他のパッケージから利用するにはどう修正すべきか

//---- default ----

/*
//package mytool.security;
//import yourtool;

public class PracticeTool {

}

class PasswordRegister{

}
*/
/*
◆解１
PracticeToolの publicを外し、PasswordRegisterを publicにする。
ファイル名もPasswordRegisterにリファクタリング

◆解２〔＝解答〕
PasswordRegisterを別クラスとしpublic宣言

◆解３
クラスである必要がなければ、PracticeToolの publicなメソッドとし
PracticeTool.passeordRegister()で呼び出す
*/