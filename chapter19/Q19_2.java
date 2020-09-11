/**
 * @title chapter19 / Additional Quest / Q19_2
 * @content File FileReader / Collection HashMap
 * @author Oshika
 * @date 2020-09-14 / 0900-
 */
/*

以下のプログラムを作成して下さい。

条件
1.まず、「ファイルの中身」と書かれた内容(18～24行目)を打ち込んだファイルを作成し、
    テキスト形式で保存する（ファイル名はActor.txt）

2.そのテキストファイルの内容を1行ずつ読み込みMapに格納する
    その時、テキスト1行に対して、空白区切りで2つの文字列があるので、
    1つ目をキー、2つ目を値とする
    （ファイルの読み込みについては18章を参考にして下さい）
3.すべてのキーと値を参照し出力する
4.キー「MIFUNE」の値を参照し出力する

ヒント：空白区切りでキーと値を作る為にsplit(String regex)メソッドを使用します。

【ファイルの中身】
MIFUNE 三船敏郎
SUGAWARA 菅原文太
TAKAKURA 高倉健
ISHIHARA 石原裕次郎
MIKUNI 三國連太郎
HARADA 原田敏夫
AKAGI 赤木圭一郎

【実行結果】
MIFUNE : 三船敏郎
SUGAWARA : 菅原文太
TAKAKURA : 高倉健
ISHIHARA : 石原裕次郎
MIKUNI : 三國連太郎
HARADA : 原田敏夫
AKAGI : 赤木圭一郎
*/

