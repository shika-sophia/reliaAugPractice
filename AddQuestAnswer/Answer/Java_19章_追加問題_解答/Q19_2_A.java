/*

	�ȉ��̃v���O�������쐬���ĉ������B
	
	����
	1.�܂��A�u�t�@�C���̒��g�v�Ə����ꂽ���e(18�`24�s��)��ł����񂾃t�@�C�����쐬���A�e�L�X�g�`���ŕۑ�����i�t�@�C������Actor.txt�j

	2.���̃e�L�X�g�t�@�C���̓��e��1�s���ǂݍ���Map�Ɋi�[����
	���̎��A�e�L�X�g1�s�ɑ΂��āA�󔒋�؂��2�̕����񂪂���̂ŁA1�ڂ��L�[�A2�ڂ�l�Ƃ���i�t�@�C���̓ǂݍ��݂ɂ��Ă�18�͂��Q�l�ɂ��ĉ������j
	3.���ׂẴL�[�ƒl���Q�Ƃ��o�͂���
	4.�L�[�uMIFUNE�v�̒l���Q�Ƃ��o�͂���

	�q���g�F�󔒋�؂�ŃL�[�ƒl�����ׂ�split(String regex)���\�b�h���g�p���܂��B


�t�@�C���̒��g

MIFUNE �O�D�q�Y
SUGAWARA ��������
TAKAKURA ���q��
ISHIHARA �Ό��T���Y
MIKUNI �O���A���Y
HARADA ���c�q�v
AKAGI �Ԗ،\��Y



�y���s���ʁz

SUGAWARA : ��������
HARADA : ���c�q�v
TAKAKURA : ���q��
MIFUNE : �O�D�q�Y
MIKUNI : �O���A���Y
ISHIHARA : �Ό��T���Y
AKAGI : �Ԗ،\��Y
MIFUNE => �O�D�q�Y
*/

//�ȉ���  ���ȏ��Ə����Ⴄ�������ɂ��Ă��܂��B�ǂ߂邩����Ă݂܂��傤�B
import java.io.*;
import java.util.*;

public class Q19_2_A {
	public static void main(String[] args) {
		try{
			if (args.length != 1) {
			System.out.println("�g�p�@: java Q19_2 �t�@�C��");
			System.out.println("��: java Q19_2 Actor.txt");
			System.exit(0);
			}
			InputStreamReader reader = new InputStreamReader(new FileInputStream(args[0]));
			BufferedReader buff = new BufferedReader(reader);
			String text ;
			Map<String,String> map = new HashMap<String,String>();
			while ((text = buff.readLine()) != null) {
//split���\�b�h  �X�y�[�X�ŕ������z��ɂ��Ă���
				String[] value = text.split(" ");
				map.put(value[0], value[1]);
			}
			reader.close();
//�g��for�����g���A�S�ẴG���g�����擾���\�����Ă���

			for (Map.Entry<String, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " +  entry.getValue());
			}
//map.get("TOKYO")�̖߂�l��\��������̂ł��悢�B�ȉ���null�`�F�b�N�����Ă���
		
			String fullname = map.get("MIFUNE");
			if(fullname != null){
				System.out.println("MIFUNE => " + fullname);
			}
		
		}catch(FileNotFoundException fnoe){
			fnoe.printStackTrace();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
/*
Map�̓C���^�[�t�F�[�X��`�̂��߁A���̂𐶐�����ۂɂ�HashMap���g�p����B
HashMap�́A�ǂ̌^�̃I�u�W�F�N�g���L�[����ђl�Ƃ��Ċi�[�\�����A�^�𖾎����鎖�ŋL�q�~�X�����炷�B���ȏ�p.298�����l�̏����������Ă���
*/
