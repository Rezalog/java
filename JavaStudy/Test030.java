/*==============================================
	���� ���� �帧�� ��Ʈ�� (���) ����
	- ���ǹ�(�б⹮)
	- if��, if-else��
===============================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());	// 13 �� true �κ� '�������', false �κи� '����', ����� ����
												// if�� 2�� �� �������� ������

		if(num%2==0)
		{
			System.out.printf("%d�� ¦���Դϴ�.\n", num);
	
		}

		if(num%2!=0)
		{
			System.out.printf("%d�� Ȧ���Դϴ�.\n", num);
		}

	}
}
/*
������ ���� �Է� : 13
13�� Ȧ���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 24
24�� ¦���Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/