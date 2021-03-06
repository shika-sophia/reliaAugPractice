/*
	String[6][2]で確保した二次元配列に以下の要素を入れて、二重for文を使って出力してください。
	for文の条件には、必ず「.length」を利用してください


	0		1
0	監督名		作品名
1	小津安二郎	東京物語
2	黒澤明		七人の侍
3	成瀬巳喜男	浮雲
4	川島雄三	幕末太陽傳
5	深作欣二	仁義なき戦い


	[実行結果]
	監督名	作品名
	小津安二郎　東京物語　
	黒澤明　七人の侍　
	成瀬巳喜男　浮雲　
	川島雄三　幕末太陽傳　
	深作欣二　仁義なき戦い　
*/


class Q9_1_A{
	public static void main(String[] args){
		String[][] arr = new String[6][2];

		arr[0][0] = "監督名";
		arr[0][1] = "作品名";

		arr[1][0] = "小津安二郎";
		arr[1][1] = "東京物語";

		arr[2][0] = "黒澤明";
		arr[2][1] = "七人の侍";

		arr[3][0] = "成瀬巳喜男";
		arr[3][1] = "浮雲";

		arr[4][0] = "川島雄三";
		arr[4][1] = "幕末太陽傳";

		arr[5][0] = "深作欣二";
		arr[5][1] = "仁義なき戦い";
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { 
				System.out.print(arr[i][j] + "　");
			}
			System.out.println("");
		}

	}
}