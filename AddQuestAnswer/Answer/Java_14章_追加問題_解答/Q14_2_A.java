/*
	以下のプログラムを作成してください

	条件
	・「付ける・外す/電源を入れる・消す」を表すonとoffというメソッドを持つインターフェースWerableを作成してください
	・Wearableを実装したHeadphoneクラスを作成
	・Wearableを実装したPortableMediaPlayerクラス（引数からボリュームの調整をするメソッドを持つ）を作成
	・実行クラスを作成。それぞれの「付ける・電源を入れる」メソッドを配列を利用して呼び出して下さい。
	・PortableMediaPlayerのボリュームを調整してみてください。


	[実行例]
	ヘッドホンを付けました。
	音楽プレーヤーの電源をオンにしました。
	ボリュームを10に変更しました。
	ヘッドホンを外しました。
	音楽プレーヤーの電源をオフにしました。

*/
//
interface Wearable{
	void on();	//pubulic abstract なのでセミコロンで終わる
	void off();	
}

class Headphone implements Wearable{
	
	@Override
	public void on(){
		System.out.println("ヘッドホンを付けました。");
	}
	
	@Override
	public void off(){
		System.out.println("ヘッドホンを外しました。");
	}
	

}

class PortableMediaPlayer implements Wearable {
	int volume = 0;

	@Override
	public void on() {
		System.out.println("音楽プレーヤーの電源をオンにしました。");
	}
	
	@Override
	public void off(){
		System.out.println("音楽プレーヤーの電源をオフにしました。");
	}
	
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("ボリュームを" + volume + "に変更しました。");
	}
}

class Q14_2_A{
	public static void main(String[] args){
		Wearable[] player = new Wearable[2];
		player[0] = new Headphone();
		player[1] = new PortableMediaPlayer();
		
		for(int i = 0; i < player.length; i++){
			player[i].on();
		}

		((PortableMediaPlayer)player[1]).setVolume(10);

		for(int i = 0; i < player.length; i++){
			player[i].off();
		}


//インスタンスをインタフェース型の変数に代入し、キャストして使った例
//(教科書P.114)
		
		Wearable headphone = new Headphone();
		Wearable portableMediaPlayer = new PortableMediaPlayer();
		((PortableMediaPlayer)portableMediaPlayer).setVolume(10);
	}
}